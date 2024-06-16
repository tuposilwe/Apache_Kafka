package com.rudiger;

import java.time.LocalDateTime;

public record Message(String message,
                      LocalDateTime created
                      ) {
}
