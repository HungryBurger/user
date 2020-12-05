package com.toris.user.controller;

import com.toris.user.model.dto.UserDto;
import com.toris.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDto>> findAllUser() {
        List<UserDto> userDtos = userService.findAllUser();

        return new ResponseEntity<>(userDtos, HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> findUserById(@PathVariable Long userId) {
        UserDto userDto = userService.findUserById(userId);

        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity insertUser(@RequestBody UserDto userDto) {
        userService.insertUser(userDto);

        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/{userId}")
    public ResponseEntity updateUser(@PathVariable Long userId,
                                     @RequestBody UserDto userDto) {
        userService.updateUser(userId, userDto);

        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);

        return new ResponseEntity(HttpStatus.OK);
    }
}

