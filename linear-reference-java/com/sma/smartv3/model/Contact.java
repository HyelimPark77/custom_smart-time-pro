package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class Contact {

    @aa1
    private String name;

    @aa1
    private String phone;

    public Contact(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "name");
        Intrinsics.X0O(r3, "phone");
        this.name = r2;
        this.phone = r3;
    }

    public static /* synthetic */ Contact copy$default(Contact r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.name;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.phone;
    L9:
        return r0.copy(r1, r2);
    }

    @aa1
    public final String component1() {
        return this.name;
    }

    @aa1
    public final String component2() {
        return this.phone;
    }

    @aa1
    public final Contact copy(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "name");
        Intrinsics.X0O(r3, "phone");
        return new Contact(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Contact) == true) goto L8;
        return false;
    L8:
        Contact r6 = (Contact) r5;
        if (Intrinsics.XOO0ii0(this.name, r6.name) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.phone, r6.phone) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @aa1
    public final String getName() {
        return this.name;
    }

    @aa1
    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.phone.hashCode();
    }

    public final void setName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.name = r2;
    }

    public final void setPhone(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.phone = r2;
    }

    @aa1
    public String toString() {
        return "Contact(name=" + this.name + ", phone=" + this.phone + I000IiI1O.iO.iO;
    }
}
