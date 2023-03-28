package com.cjpjisp;

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

  public CjPjispModule(ReactApplicationContext reactContext) {
    super(reactContext);
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

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  public void multiply(double a, double b, Promise promise) {
    promise.resolve(a * b);
  }
}
