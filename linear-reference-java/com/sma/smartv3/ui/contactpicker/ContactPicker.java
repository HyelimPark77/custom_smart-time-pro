package com.sma.smartv3.ui.contactpicker;

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

/* JADX INFO: loaded from: classes19.dex */
public class ContactPicker {
    public static final int CHOICE_MODE_MULTIPLE = 0;
    public static final int CHOICE_MODE_SINGLE = 1;
    public static final int LOAD_ASYNC = 0;
    public static final int LOAD_SYNC = 1;

    public static class Builder implements Serializable {
        protected transient Activity acc;
        protected Integer animationCloseEnter;
        protected Integer animationCloseExit;
        protected Integer animationOpenEnter;
        protected Integer animationOpenExit;
        protected int bubbleColor;
        protected int bubbleTextColor;
        protected LimitColumn columnLimit;
        protected transient Fragment frag;
        protected int handleColor;
        protected boolean hideScrollbar;
        protected int loadingMode;
        protected int maxSelectCount;
        protected Integer searchIconColor;
        protected ArrayList<Long> selectedItems;
        protected int selectionMode;
        protected boolean showTrack;

        @StyleRes
        protected int theme;
        protected String titleText;
        protected int trackColor;

        public Builder(@NonNull Activity act) {
            this.theme = R.style.ContactPickerTheme;
            this.columnLimit = LimitColumn.NONE;
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

        public Builder limitToColumn(LimitColumn limitedColumn) {
            this.columnLimit = limitedColumn;
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

        public Builder setSelectedContacts(String... selectedContactIDs) {
            this.selectedItems.clear();
            int r0 = selectedContactIDs.length;
            int r1 = 0;
        L3:
            if (r1 >= r0) goto L5;
            String r2 = selectedContactIDs[r1];
            this.selectedItems.add(Long.valueOf(Long.parseLong(r2)));
            r1 = r1 + 1;
            goto L3
        L5:
            return this;
        }

        public Builder setTitleText(String titleText) {
            this.titleText = titleText;
            return this;
        }

        public void showPickerForResult(int requestCode) {
            if (this.acc == null) goto L10;
            Intent r0 = new Intent(this.acc, ContactPickerActivity.class);
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
            Intent r2 = new Intent(getActivity(), ContactPickerActivity.class);
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

        public Builder setSelectedContacts(ArrayList<ContactResult> selectedContacts) {
            this.selectedItems.clear();
            Iterator<ContactResult> r5 = selectedContacts.iterator();
        L4:
            if (r5.hasNext() == false) goto L6;
            ContactResult r0 = r5.next();
            this.selectedItems.add(Long.valueOf(Long.parseLong(r0.getContactID())));
            goto L4
        L6:
            return this;
        }

        public Builder(@NonNull Fragment frag) {
            this.theme = R.style.ContactPickerTheme;
            this.columnLimit = LimitColumn.NONE;
            this.showTrack = true;
            this.selectionMode = 0;
            this.loadingMode = 0;
            this.selectedItems = new ArrayList();
            this.maxSelectCount = 0;
            this.frag = frag;
        }
    }

    public ContactPicker() {
    }

    public static ArrayList<ContactResult> buildResult(List<Contact> selectedContacts) {
        ArrayList<ContactResult> r0 = new ArrayList();
        Iterator<Contact> r3 = selectedContacts.iterator();
    L4:
        if (r3.hasNext() == false) goto L6;
        r0.add(new ContactResult(r3.next()));
        goto L4
    L6:
        return r0;
    }

    public static ArrayList<ContactResult> obtainResult(Intent data) {
        return data.getParcelableArrayListExtra("extra_result_selection");
    }
}
