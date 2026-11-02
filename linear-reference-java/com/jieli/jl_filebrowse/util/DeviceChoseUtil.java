package com.jieli.jl_filebrowse.util;

import com.jieli.jl_filebrowse.FileBrowseManager;
import com.jieli.jl_filebrowse.bean.SDCardBean;
import com.jieli.jl_rcsp.util.JL_Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class DeviceChoseUtil {
    public static final String a = "DeviceChoseUtil";

    static {
    }

    public DeviceChoseUtil() {
    }

    public static List<SDCardBean> getSdOfUsbDev() {
        List<SDCardBean> r0 = FileBrowseManager.getInstance().getOnlineDev();
        ArrayList r1 = new ArrayList();
        Iterator<SDCardBean> r2 = r0.iterator();
    L4:
        if (r2.hasNext() == false) goto L10;
        SDCardBean r3 = r2.next();
        if (r3.getType() == 0) goto L9;
        if (r3.getType() != 1) goto L4;
    L9:
        r1.add(r3);
        goto L4
    L10:
        return r1;
    }

    public static SDCardBean getTargetDev() {
        if (FileBrowseManager.getInstance().getOnlineDev().isEmpty() == false) goto L6;
        JL_Log.e(a, "getTargetDev", "no online device");
        return null;
    L6:
        List<SDCardBean> r0 = FileBrowseManager.getInstance().getOnlineDev();
        Iterator<SDCardBean> r2 = r0.iterator();
    L8:
        if (r2.hasNext() == false) goto L12;
        SDCardBean r3 = r2.next();
        if (r3.getType() != 0) goto L8;
        return r3;
    L12:
        Iterator<SDCardBean> r1 = r0.iterator();
    L14:
        if (r1.hasNext() == false) goto L18;
        SDCardBean r4 = r1.next();
        if (r4.getType() != 1) goto L14;
        return r4;
    L18:
        return null;
    }

    public static SDCardBean getTargetDevFlash2First() {
        if (FileBrowseManager.getInstance().getOnlineDev().isEmpty() == false) goto L6;
        JL_Log.e(a, "getTargetDevFlash2First", "no online device");
        return null;
    L6:
        Iterator<SDCardBean> r0 = FileBrowseManager.getInstance().getOnlineDev().iterator();
    L8:
        if (r0.hasNext() == false) goto L13;
        SDCardBean r1 = r0.next();
        if (r1.getType() != 4) goto L8;
        return r1;
    L13:
        return getTargetDev();
    }
}
