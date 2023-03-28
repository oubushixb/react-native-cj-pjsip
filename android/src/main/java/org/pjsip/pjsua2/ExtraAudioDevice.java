/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class ExtraAudioDevice extends AudioMedia {
  private transient long swigCPtr;

  protected ExtraAudioDevice(long cPtr, boolean cMemoryOwn) {
    super(pjsua2JNI.ExtraAudioDevice_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ExtraAudioDevice obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(ExtraAudioDevice obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_ExtraAudioDevice(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ExtraAudioDevice(int playdev, int recdev) {
    this(pjsua2JNI.new_ExtraAudioDevice(playdev, recdev), true);
  }

  public void open() {
    pjsua2JNI.ExtraAudioDevice_open(swigCPtr, this);
  }

  public void close() {
    pjsua2JNI.ExtraAudioDevice_close(swigCPtr, this);
  }

  public boolean isOpened() {
    return pjsua2JNI.ExtraAudioDevice_isOpened(swigCPtr, this);
  }

}