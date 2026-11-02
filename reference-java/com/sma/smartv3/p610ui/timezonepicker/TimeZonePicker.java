package com.sma.smartv3.p610ui.timezonepicker;

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

    /* JADX INFO: renamed from: iO */
    public static final int f54811iO = 1;

    public static ArrayList<TimeZoneResult> OXO1(List<TimeZoneInfo> selectedTimeZones) {
        ArrayList<TimeZoneResult> arrayList = new ArrayList<>();
        Iterator<TimeZoneInfo> it = selectedTimeZones.iterator();
        while (it.hasNext()) {
            arrayList.add(new TimeZoneResult(it.next()));
        }
        return arrayList;
    }

    public static ArrayList<TimeZoneResult> XIi00iiXO(Intent data) {
        return data.getParcelableArrayListExtra("extra_result_selection");
    }

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
        protected Integer searchIconColor;
        protected String titleText;
        protected int trackColor;

        @StyleRes
        protected int theme = R.style.ContactPickerTheme;
        protected boolean showTrack = true;
        protected int selectionMode = 0;
        protected int loadingMode = 0;
        protected ArrayList<String> selectedItems = new ArrayList<>();
        protected int maxSelectCount = 0;

        public Builder(@NonNull Activity act) {
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
            Iterator<String> it = selectedTimeZoneIds.iterator();
            while (it.hasNext()) {
                this.selectedItems.add(it.next());
            }
            return this;
        }

        public Builder setTitleText(String titleText) {
            this.titleText = titleText;
            return this;
        }

        public void showPickerForResult(int requestCode) {
            if (this.acc != null) {
                Intent intent = new Intent(this.acc, (Class<?>) TimeZonePickerActivity.class);
                intent.putExtra("builder", this);
                this.acc.startActivityForResult(intent, requestCode);
                Integer num = this.animationOpenEnter;
                if (num == null || this.animationOpenExit == null) {
                    return;
                }
                this.acc.overridePendingTransition(num.intValue(), this.animationOpenExit.intValue());
                return;
            }
            Fragment fragment = this.frag;
            if (fragment == null) {
                throw new RuntimeException("Unable to find a context for intent. Is there a valid activity or fragment passed in the builder?");
            }
            if (fragment.getActivity() != null) {
                Intent intent2 = new Intent(this.frag.getActivity(), (Class<?>) TimeZonePickerActivity.class);
                intent2.putExtra("builder", this);
                this.frag.startActivityForResult(intent2, requestCode);
                if (this.animationOpenEnter == null || this.animationOpenExit == null) {
                    return;
                }
                this.frag.getActivity().overridePendingTransition(this.animationOpenEnter.intValue(), this.animationOpenExit.intValue());
            }
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
            Iterator<TimeZoneInfo> it = selectedTimeZones.iterator();
            while (it.hasNext()) {
                this.selectedItems.add(it.next().getTimeZoneId());
            }
            return this;
        }

        public Builder(@NonNull Fragment frag) {
            this.frag = frag;
        }
    }
}
