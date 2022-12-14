// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRecipe1Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Toolbar appToolbar;

  @NonNull
  public final Button button;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final LinearLayout linearLayout1;

  @NonNull
  public final ListView listView;

  @NonNull
  public final EditText searchText;

  @NonNull
  public final TextView toolbarTitle;

  @NonNull
  public final TextView tvNr;

  private ActivityRecipe1Binding(@NonNull LinearLayout rootView, @NonNull Toolbar appToolbar,
      @NonNull Button button, @NonNull LinearLayout linearLayout,
      @NonNull LinearLayout linearLayout1, @NonNull ListView listView, @NonNull EditText searchText,
      @NonNull TextView toolbarTitle, @NonNull TextView tvNr) {
    this.rootView = rootView;
    this.appToolbar = appToolbar;
    this.button = button;
    this.linearLayout = linearLayout;
    this.linearLayout1 = linearLayout1;
    this.listView = listView;
    this.searchText = searchText;
    this.toolbarTitle = toolbarTitle;
    this.tvNr = tvNr;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRecipe1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRecipe1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_recipe1, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRecipe1Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.app_toolbar;
      Toolbar appToolbar = ViewBindings.findChildViewById(rootView, id);
      if (appToolbar == null) {
        break missingId;
      }

      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.linearLayout1;
      LinearLayout linearLayout1 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout1 == null) {
        break missingId;
      }

      id = R.id.listView;
      ListView listView = ViewBindings.findChildViewById(rootView, id);
      if (listView == null) {
        break missingId;
      }

      id = R.id.searchText;
      EditText searchText = ViewBindings.findChildViewById(rootView, id);
      if (searchText == null) {
        break missingId;
      }

      id = R.id.toolbar_title;
      TextView toolbarTitle = ViewBindings.findChildViewById(rootView, id);
      if (toolbarTitle == null) {
        break missingId;
      }

      id = R.id.tv_nr;
      TextView tvNr = ViewBindings.findChildViewById(rootView, id);
      if (tvNr == null) {
        break missingId;
      }

      return new ActivityRecipe1Binding((LinearLayout) rootView, appToolbar, button, linearLayout,
          linearLayout1, listView, searchText, toolbarTitle, tvNr);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
