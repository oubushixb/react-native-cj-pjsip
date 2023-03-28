package com.cjpjisp;

import android.content.Intent;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Callback;

@ReactModule(name = CjPjispModule.NAME)
public class CjPjispModule extends ReactContextBaseJavaModule {
  public static final String NAME = "CjPjisp";

  private static PjSipBroadcastReceiver receiver;

  public CjPjispModule(ReactApplicationContext reactContext) {
    super(reactContext);

    // Module could be started several times, but we have to register receiver only once.
    if (receiver == null) {
      receiver = new PjSipBroadcastReceiver(reactContext);
      this.getReactApplicationContext().registerReceiver(receiver, receiver.getFilter());
    } else {
      receiver.setContext(reactContext);
    }
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }

  @ReactMethod
  public void start(ReadableMap configuration, Callback callback) {
    int id = receiver.register(callback);
    Intent intent = PjActions.createStartIntent(id, configuration, getReactApplicationContext());

    getReactApplicationContext().startService(intent);
  }

  @ReactMethod
  public void changeServiceConfiguration(ReadableMap configuration, Callback callback) {
    int id = receiver.register(callback);
    Intent intent = PjActions.createSetServiceConfigurationIntent(id, configuration, getReactApplicationContext());
    getReactApplicationContext().startService(intent);
  }

  @ReactMethod
  public void createAccount(ReadableMap configuration, Callback callback) {
    int id = receiver.register(callback);
    Intent intent = PjActions.createAccountCreateIntent(id, configuration, getReactApplicationContext());
    getReactApplicationContext().startService(intent);
  }

  @ReactMethod
  public void registerAccount(int accountId, boolean renew, Callback callback) {
    int id = receiver.register(callback);
    Intent intent = PjActions.createAccountRegisterIntent(id, accountId, renew, getReactApplicationContext());
    getReactApplicationContext().startService(intent);
  }

  @ReactMethod
  public void deleteAccount(int accountId, Callback callback) {
    int callbackId = receiver.register(callback);
    Intent intent = PjActions.createAccountDeleteIntent(callbackId, accountId, getReactApplicationContext());
    getReactApplicationContext().startService(intent);
  }

  @ReactMethod
  public void makeCall(int accountId, String destination, ReadableMap callSettings, ReadableMap msgData,  Callback callback) {
    int callbackId = receiver.register(callback);
    Intent intent = PjActions.createMakeCallIntent(callbackId, accountId, destination, callSettings, msgData, getReactApplicationContext());
    getReactApplicationContext().startService(intent);
  }

  @ReactMethod
  public void hangupCall(int callId, Callback callback) {
    int callbackId = receiver.register(callback);
    Intent intent = PjActions.createHangupCallIntent(callbackId, callId, getReactApplicationContext());
    getReactApplicationContext().startService(intent);
  }

  @ReactMethod
  public void declineCall(int callId, Callback callback) {
    int callbackId = receiver.register(callback);
    Intent intent = PjActions.createDeclineCallIntent(callbackId, callId, getReactApplicationContext());
    getReactApplicationContext().startService(intent);
  }

  @ReactMethod
  public void answerCall(int callId, Callback callback) {
    int callbackId = receiver.register(callback);
    Intent intent = PjActions.createAnswerCallIntent(callbackId, callId, getReactApplicationContext());
    getReactApplicationContext().startService(intent);
  }

  @ReactMethod
  public void holdCall(int callId, Callback callback) {
    int callbackId = receiver.register(callback);
    Intent intent = PjActions.createHoldCallIntent(callbackId, callId, getReactApplicationContext());
    getReactApplicationContext().startService(intent);
  }

  @ReactMethod
  public void unholdCall(int callId, Callback callback) {
    int callbackId = receiver.register(callback);
    Intent intent = PjActions.createUnholdCallIntent(callbackId, callId, getReactApplicationContext());
    getReactApplicationContext().startService(intent);
  }

  @ReactMethod
  public void muteCall(int callId, Callback callback) {
    int callbackId = receiver.register(callback);
    Intent intent = PjActions.createMuteCallIntent(callbackId, callId, getReactApplicationContext());
    getReactApplicationContext().startService(intent);
  }

  @ReactMethod
  public void unMuteCall(int callId, Callback callback) {
    int callbackId = receiver.register(callback);
    Intent intent = PjActions.createUnMuteCallIntent(callbackId, callId, getReactApplicationContext());
    getReactApplicationContext().startService(intent);
  }

  @ReactMethod
  public void useSpeaker(int callId, Callback callback) {
    int callbackId = receiver.register(callback);
    Intent intent = PjActions.createUseSpeakerCallIntent(callbackId, callId, getReactApplicationContext());
    getReactApplicationContext().startService(intent);
  }

  @ReactMethod
  public void useEarpiece(int callId, Callback callback) {
    int callbackId = receiver.register(callback);
    Intent intent = PjActions.createUseEarpieceCallIntent(callbackId, callId, getReactApplicationContext());
    getReactApplicationContext().startService(intent);
  }

  @ReactMethod
  public void xferCall(int callId, String destination, Callback callback) {
    int callbackId = receiver.register(callback);
    Intent intent = PjActions.createXFerCallIntent(callbackId, callId, destination, getReactApplicationContext());
    getReactApplicationContext().startService(intent);
  }

  @ReactMethod
  public void xferReplacesCall(int callId, int destCallId, Callback callback) {
    int callbackId = receiver.register(callback);
    Intent intent = PjActions.createXFerReplacesCallIntent(callbackId, callId, destCallId, getReactApplicationContext());
    getReactApplicationContext().startService(intent);
  }

  @ReactMethod
  public void redirectCall(int callId, String destination, Callback callback) {
    int callbackId = receiver.register(callback);
    Intent intent = PjActions.createRedirectCallIntent(callbackId, callId, destination, getReactApplicationContext());
    getReactApplicationContext().startService(intent);
  }

  @ReactMethod
  public void dtmfCall(int callId, String digits, Callback callback) {
    int callbackId = receiver.register(callback);
    Intent intent = PjActions.createDtmfCallIntent(callbackId, callId, digits, getReactApplicationContext());
    getReactApplicationContext().startService(intent);
  }

  @ReactMethod
  public void changeCodecSettings(ReadableMap codecSettings, Callback callback) {
    int callbackId = receiver.register(callback);
    Intent intent = PjActions.createChangeCodecSettingsIntent(callbackId, codecSettings, getReactApplicationContext());
    getReactApplicationContext().startService(intent);
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  public void multiply(double a, double b, Promise promise) {
    promise.resolve(a * b);
  }
}
