package com.anglehack.anywhereLibrary.api.library.dto;

import com.anglehack.anywhereLibrary.api.library.entity.Library;
import com.anglehack.anywhereLibrary.api.seat.dto.SimpleSeat;
import com.anglehack.anywhereLibrary.api.user.dto.SimpleUser;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Builder
public class SimpleLibrary {
    private Long id;
    private String name;
    private SimpleUser owner;
    private int totalPersonnel;
    private String hangout;
    private List<SimpleSeat> seats = new ArrayList<>();

    public static SimpleLibrary of(Library library) {
        List<SimpleSeat> seats = new ArrayList<>();
        library.getSeats().forEach(
                    seat -> {
                        if (seat != null)
                            seats.add(SimpleSeat.of(seat));
                    }
                );

        return SimpleLibrary.builder()
                .id(library.getId())
                .name(library.getName())
                .owner(SimpleUser.of(library.getOwner()))
                .hangout(library.getHangout())
                .seats(seats)
                .totalPersonnel(library.getTotalPersonnel())
                .build();
    }
}