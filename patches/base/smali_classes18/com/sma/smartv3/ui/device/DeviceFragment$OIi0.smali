.class public final Lcom/sma/smartv3/ui/device/DeviceFragment$OIi0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O0Oiii;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/DeviceFragment;->threePopup(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O0Oiii<",
        "[",
        "Lcom/sma/smartv3/model/ExtraPackageData;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeviceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment$threePopup$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3223:1\n99#2,7:3224\n106#2,3:3232\n79#2,7:3235\n109#2:3242\n1#3:3231\n*S KotlinDebug\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment$threePopup$1\n*L\n2832#1:3224,7\n2832#1:3232,3\n2832#1:3235,7\n2832#1:3242\n2832#1:3231\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeviceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment$threePopup$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3223:1\n99#2,7:3224\n106#2,3:3232\n79#2,7:3235\n109#2:3242\n1#3:3231\n*S KotlinDebug\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment$threePopup$1\n*L\n2832#1:3224,7\n2832#1:3232,3\n2832#1:3235,7\n2832#1:3242\n2832#1:3231\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/DeviceFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/DeviceFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$OIi0;->OXO1:Lcom/sma/smartv3/ui/device/DeviceFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final O00(Lcom/sma/smartv3/ui/device/DeviceFragment;)Z
    .locals 4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "mArg0"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "mArg1"

    const v3, 0x7f1414ca

    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "mArg2"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v1, "mArg3"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v2

    const-class v3, Lcom/sma/smartv3/ui/me/LanguageListActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->access$fourPopup(Lcom/sma/smartv3/ui/device/DeviceFragment;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/device/DeviceFragment;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment$OIi0;->O00(Lcom/sma/smartv3/ui/device/DeviceFragment;)Z

    move-result p0

    return p0
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/device/DeviceFragment;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment$OIi0;->XO0O10(Lcom/sma/smartv3/ui/device/DeviceFragment;)Z

    move-result p0

    return p0
.end method

.method public static final XO0O10(Lcom/sma/smartv3/ui/device/DeviceFragment;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->access$fourPopup(Lcom/sma/smartv3/ui/device/DeviceFragment;)V

    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public iO([Lcom/sma/smartv3/model/ExtraPackageData;)V
    .locals 4

    if-eqz p1, :cond_1

    array-length p1, p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    if-nez p1, :cond_1

    new-instance p1, Lcom/android/mltcode/paycertificationapi/go0;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$OIi0;->OXO1:Lcom/sma/smartv3/ui/device/DeviceFragment;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/DeviceFragment;->access$getMActivity(Lcom/sma/smartv3/ui/device/DeviceFragment;)Landroid/app/Activity;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {p1, v1, v0, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$OIi0;->OXO1:Lcom/sma/smartv3/ui/device/DeviceFragment;

    const v1, 0x7f1414ca

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f140dce

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/iOXXI0i;

    invoke-direct {v2, v0}, Lcom/android/mltcode/paycertificationapi/iOXXI0i;-><init>(Lcom/sma/smartv3/ui/device/DeviceFragment;)V

    invoke-virtual {p1, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iXIiI10;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/iXIiI10;-><init>(Lcom/sma/smartv3/ui/device/DeviceFragment;)V

    const v0, 0x7f14122c

    invoke-virtual {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$OIi0;->OXO1:Lcom/sma/smartv3/ui/device/DeviceFragment;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/DeviceFragment;->getRootView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$OIi0;->OXO1:Lcom/sma/smartv3/ui/device/DeviceFragment;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/DeviceFragment;->access$fourPopup(Lcom/sma/smartv3/ui/device/DeviceFragment;)V

    return-void
.end method

.method public onFailure(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$OIi0;->OXO1:Lcom/sma/smartv3/ui/device/DeviceFragment;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/DeviceFragment;->access$fourPopup(Lcom/sma/smartv3/ui/device/DeviceFragment;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Lcom/sma/smartv3/model/ExtraPackageData;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/DeviceFragment$OIi0;->iO([Lcom/sma/smartv3/model/ExtraPackageData;)V

    return-void
.end method
