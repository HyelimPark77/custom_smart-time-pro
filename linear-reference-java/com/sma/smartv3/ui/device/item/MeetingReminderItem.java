package com.sma.smartv3.ui.device.item;

import com.android.mltcode.paycertificationapi.q62;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes18.dex */
public final class MeetingReminderItem extends BaseDeviceItem {
    public MeetingReminderItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden(!q62.OXO1.i1i());
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_meeting_reminder;
    }
}
