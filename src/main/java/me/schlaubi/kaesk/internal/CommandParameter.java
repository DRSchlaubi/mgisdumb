package me.schlaubi.kaesk.internal;

import org.jetbrains.annotations.NotNull;

record CommandParameter(@NotNull Class<?>type, boolean isVarArg, @NotNull String name,
                        @NotNull String surrounding) {

  public boolean isSurrounded() {
    return !surrounding.isBlank();
  }
}
