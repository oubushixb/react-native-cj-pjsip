/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pj_qos_type {
  public final static int PJ_QOS_TYPE_BEST_EFFORT = 0;
  public final static int PJ_QOS_TYPE_BACKGROUND = PJ_QOS_TYPE_BEST_EFFORT + 1;
  public final static int PJ_QOS_TYPE_VIDEO = PJ_QOS_TYPE_BACKGROUND + 1;
  public final static int PJ_QOS_TYPE_VOICE = PJ_QOS_TYPE_VIDEO + 1;
  public final static int PJ_QOS_TYPE_CONTROL = PJ_QOS_TYPE_VOICE + 1;
  public final static int PJ_QOS_TYPE_SIGNALLING = PJ_QOS_TYPE_CONTROL + 1;
}
