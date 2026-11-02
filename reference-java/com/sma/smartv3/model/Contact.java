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

    public Contact(@aa1 String name, @aa1 String phone) {
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(phone, "phone");
        this.name = name;
        this.phone = phone;
    }

    public static /* synthetic */ Contact copy$default(Contact contact, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contact.name;
        }
        if ((i & 2) != 0) {
            str2 = contact.phone;
        }
        return contact.copy(str, str2);
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
    public final Contact copy(@aa1 String name, @aa1 String phone) {
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(phone, "phone");
        return new Contact(name, phone);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Contact)) {
            return false;
        }
        Contact contact = (Contact) obj;
        return Intrinsics.XOO0ii0(this.name, contact.name) && Intrinsics.XOO0ii0(this.phone, contact.phone);
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

    public final void setName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.name = str;
    }

    public final void setPhone(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.phone = str;
    }

    @aa1
    public String toString() {
        return "Contact(name=" + this.name + ", phone=" + this.phone + I000IiI1O.C2156iO.f1007iO;
    }
}
