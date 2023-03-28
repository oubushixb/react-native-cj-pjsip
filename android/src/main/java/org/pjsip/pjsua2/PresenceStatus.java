/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class PresenceStatus {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected PresenceStatus(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PresenceStatus obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(PresenceStatus obj) {
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
        pjsua2JNI.delete_PresenceStatus(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setStatus(int value) {
    pjsua2JNI.PresenceStatus_status_set(swigCPtr, this, value);
  }

  public int getStatus() {
    return pjsua2JNI.PresenceStatus_status_get(swigCPtr, this);
  }

  public void setStatusText(String value) {
    pjsua2JNI.PresenceStatus_statusText_set(swigCPtr, this, value);
  }

  public String getStatusText() {
    return pjsua2JNI.PresenceStatus_statusText_get(swigCPtr, this);
  }

  public void setActivity(int value) {
    pjsua2JNI.PresenceStatus_activity_set(swigCPtr, this, value);
  }

  public int getActivity() {
    return pjsua2JNI.PresenceStatus_activity_get(swigCPtr, this);
  }

  public void setNote(String value) {
    pjsua2JNI.PresenceStatus_note_set(swigCPtr, this, value);
  }

  public String getNote() {
    return pjsua2JNI.PresenceStatus_note_get(swigCPtr, this);
  }

  public void setRpidId(String value) {
    pjsua2JNI.PresenceStatus_rpidId_set(swigCPtr, this, value);
  }

  public String getRpidId() {
    return pjsua2JNI.PresenceStatus_rpidId_get(swigCPtr, this);
  }

  public PresenceStatus() {
    this(pjsua2JNI.new_PresenceStatus(), true);
  }

}