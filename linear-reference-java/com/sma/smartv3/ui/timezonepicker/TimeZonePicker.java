package com.sma.smartv3.ui.timezonepicker;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.AnimRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.fragment.app.Fragment;
import com.sma.smartv3.pro.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class TimeZonePicker {
    public static final int O00 = 1;
    public static final int OXO1 = 992;
    public static final int XIi00iiXO = 0;
    public static final int XO0O10 = 0;
    public static final int iO = 1;

    public static class Builder implements Serializable {
        protected transient Activity acc;
        protected Integer animationCloseEnter;
        protected Integer animationCloseExit;
        protected Integer animationOpenEnter;
        protected Integer animationOpenExit;
        protected int bubbleColor;
        protected int bubbleTextColor;
        protected transient Fragment frag;
        protected int handleColor;
        protected boolean hideScrollbar;
        protected int loadingMode;
        protected int maxSelectCount;
        protected Integer searchIconColor;
        protected ArrayList<String> selectedItems;
        protected int selectionMode;
        protected boolean showTrack;

        @StyleRes
        protected int theme;
        protected String titleText;
        protected int trackColor;

        public Builder(@NonNull Activity act) {
            this.theme = R.style.ContactPickerTheme;
            this.showTrack = true;
            this.selectionMode = 0;
            this.loadingMode = 0;
            this.selectedItems = new ArrayList();
            this.maxSelectCount = 0;
            this.acc = act;
        }

        public Builder bubbleColor(@ColorInt int bubbleColor) {
            this.bubbleColor = bubbleColor;
            return this;
        }

        public Builder bubbleTextColor(@ColorInt int textColor) {
            this.bubbleTextColor = textColor;
            return this;
        }

        public Builder handleColor(@ColorInt int handleColor) {
            this.handleColor = handleColor;
            return this;
        }

        public Builder hideScrollbar(boolean hideScrollbar) {
            this.hideScrollbar = hideScrollbar;
            return this;
        }

        public Builder searchIconColor(@ColorInt Integer searchIconColor) {
            this.searchIconColor = searchIconColor;
            return this;
        }

        public Builder setActivityAnimations(@AnimRes Integer animationOpenEnter, @AnimRes Integer animationOpenExit, @AnimRes Integer animationCloseEnter, @AnimRes Integer animationCloseExit) {
            this.animationOpenEnter = animationOpenEnter;
            this.animationOpenExit = animationOpenExit;
            this.animationCloseEnter = animationCloseEnter;
            this.animationCloseExit = animationCloseExit;
            return this;
        }

        public Builder setChoiceMode(int selectionMode) {
            this.selectionMode = selectionMode;
            return this;
        }

        public Builder setLoadingType(int loadingMode) {
            this.loadingMode = loadingMode;
            return this;
        }

        public Builder setMaxSelectCount(int maxSelectCount) {
            this.maxSelectCount = maxSelectCount;
            return this;
        }

        public Builder setSelected(List<String> selectedTimeZoneIds) {
            this.selectedItems.clear();
            Iterator<String> r3 = selectedTimeZoneIds.iterator();
        L4:
            if (r3.hasNext() == false) goto L6;
            String r0 = r3.next();
            this.selectedItems.add(r0);
            goto L4
        L6:
            return this;
        }

        public Builder setTitleText(String titleText) {
            this.titleText = titleText;
            return this;
        }

        public void showPickerForResult(int requestCode) {
            if (this.acc == null) goto L10;
            Intent r0 = new Intent(this.acc, TimeZonePickerActivity.class);
            r0.putExtra("builder", this);
            this.acc.startActivityForResult(r0, requestCode);
            Integer r5 = this.animationOpenEnter;
            if (r5 != null) goto L7;
            return;
        L7:
            if (this.animationOpenExit == null) goto L23;
            this.acc.overridePendingTransition(r5.intValue(), this.animationOpenExit.intValue());
            return;
        L23:
            return;
        L10:
            Fragment r1 = this.frag;
            if (r1 == null) goto L21;
            if (r1.getActivity() == null) goto L24;
            Intent r2 = new Intent(getActivity(), TimeZonePickerActivity.class);
            r2.putExtra("builder", this);
            startActivityForResult(r2, requestCode);
            if (this.animationOpenEnter != null) goto L17;
            return;
        L17:
            if (this.animationOpenExit == null) goto L26;
            getActivity().overridePendingTransition(this.animationOpenEnter.intValue(), this.animationOpenExit.intValue());
            return;
        L26:
            return;
        L24:
            return;
        L21:
            throw new RuntimeException("Unable to find a context for intent. Is there a valid activity or fragment passed in the builder?");
        }

        public Builder showTrack(boolean showTrack) {
            this.showTrack = showTrack;
            return this;
        }

        public Builder theme(@StyleRes int theme) {
            this.theme = theme;
            return this;
        }

        public Builder trackColor(@ColorInt int trackColor) {
            this.trackColor = trackColor;
            return this;
        }

        public Builder setSelected(ArrayList<TimeZoneInfo> selectedTimeZones) {
            this.selectedItems.clear();
            Iterator<TimeZoneInfo> r3 = selectedTimeZones.iterator();
        L4:
            if (r3.hasNext() == false) goto L6;
            TimeZoneInfo r0 = r3.next();
            this.selectedItems.add(r0.getTimeZoneId());
            goto L4
        L6:
            return this;
        }

        public Builder(@NonNull Fragment frag) {
            this.theme = R.style.ContactPickerTheme;
            this.showTrack = true;
            this.selectionMode = 0;
            this.loadingMode = 0;
            this.selectedItems = new ArrayList();
            this.maxSelectCount = 0;
            this.frag = frag;
        }
    }

    public TimeZonePicker() {
    }

    public static ArrayList<TimeZoneResult> OXO1(List<TimeZoneInfo> selectedTimeZones) {
        ArrayList<TimeZoneResult> r0 = new ArrayList();
        Iterator<TimeZoneInfo> r3 = selectedTimeZones.iterator();
    L4:
        if (r3.hasNext() == false) goto L6;
        r0.add(new TimeZoneResult(r3.next()));
        goto L4
    L6:
        return r0;
    }

    public static ArrayList<TimeZoneResult> XIi00iiXO(Intent data) {
        return data.getParcelableArrayListExtra("extra_result_selection");
    }
}
