// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityJoinBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView appName;

  @NonNull
  public final Button btnSignup;

  @NonNull
  public final TextInputEditText jEditId;

  @NonNull
  public final TextInputEditText jEditPw;

  @NonNull
  public final TextInputEditText jEditTel;

  @NonNull
  public final TextInputEditText jEditUname;

  @NonNull
  public final TextInputLayout jTiId;

  @NonNull
  public final TextInputLayout jTiPw;

  @NonNull
  public final TextInputLayout jTiTel;

  @NonNull
  public final TextInputLayout jTiUname;

  private ActivityJoinBinding(@NonNull LinearLayout rootView, @NonNull ImageView appName,
      @NonNull Button btnSignup, @NonNull TextInputEditText jEditId,
      @NonNull TextInputEditText jEditPw, @NonNull TextInputEditText jEditTel,
      @NonNull TextInputEditText jEditUname, @NonNull TextInputLayout jTiId,
      @NonNull TextInputLayout jTiPw, @NonNull TextInputLayout jTiTel,
      @NonNull TextInputLayout jTiUname) {
    this.rootView = rootView;
    this.appName = appName;
    this.btnSignup = btnSignup;
    this.jEditId = jEditId;
    this.jEditPw = jEditPw;
    this.jEditTel = jEditTel;
    this.jEditUname = jEditUname;
    this.jTiId = jTiId;
    this.jTiPw = jTiPw;
    this.jTiTel = jTiTel;
    this.jTiUname = jTiUname;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityJoinBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityJoinBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_join, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityJoinBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.app_name;
      ImageView appName = ViewBindings.findChildViewById(rootView, id);
      if (appName == null) {
        break missingId;
      }

      id = R.id.btn_signup;
      Button btnSignup = ViewBindings.findChildViewById(rootView, id);
      if (btnSignup == null) {
        break missingId;
      }

      id = R.id.j_edit_id;
      TextInputEditText jEditId = ViewBindings.findChildViewById(rootView, id);
      if (jEditId == null) {
        break missingId;
      }

      id = R.id.j_edit_pw;
      TextInputEditText jEditPw = ViewBindings.findChildViewById(rootView, id);
      if (jEditPw == null) {
        break missingId;
      }

      id = R.id.j_edit_tel;
      TextInputEditText jEditTel = ViewBindings.findChildViewById(rootView, id);
      if (jEditTel == null) {
        break missingId;
      }

      id = R.id.j_edit_uname;
      TextInputEditText jEditUname = ViewBindings.findChildViewById(rootView, id);
      if (jEditUname == null) {
        break missingId;
      }

      id = R.id.j_ti_id;
      TextInputLayout jTiId = ViewBindings.findChildViewById(rootView, id);
      if (jTiId == null) {
        break missingId;
      }

      id = R.id.j_ti_pw;
      TextInputLayout jTiPw = ViewBindings.findChildViewById(rootView, id);
      if (jTiPw == null) {
        break missingId;
      }

      id = R.id.j_ti_tel;
      TextInputLayout jTiTel = ViewBindings.findChildViewById(rootView, id);
      if (jTiTel == null) {
        break missingId;
      }

      id = R.id.j_ti_uname;
      TextInputLayout jTiUname = ViewBindings.findChildViewById(rootView, id);
      if (jTiUname == null) {
        break missingId;
      }

      return new ActivityJoinBinding((LinearLayout) rootView, appName, btnSignup, jEditId, jEditPw,
          jEditTel, jEditUname, jTiId, jTiPw, jTiTel, jTiUname);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
