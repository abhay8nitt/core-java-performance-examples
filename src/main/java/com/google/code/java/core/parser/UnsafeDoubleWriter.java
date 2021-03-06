/*
 * Copyright (c) 2011.  Peter Lawrey
 *
 * "THE BEER-WARE LICENSE" (Revision 128)
 * As long as you retain this notice you can do whatever you want with this stuff.
 * If we meet some day, and you think this stuff is worth it, you can buy me a beer in return
 * There is no warranty.
 */

package com.google.code.java.core.parser;

public class UnsafeDoubleWriter implements DoubleWriter {
  private long address;

  public UnsafeDoubleWriter(long address) {
    this.address = address;
  }

  @Override
  public void write(double num) {
    ParserUtils.UNSAFE.putDouble(address, num);
    address += 8;
  }

  @Override
  public void close() {

  }
}
