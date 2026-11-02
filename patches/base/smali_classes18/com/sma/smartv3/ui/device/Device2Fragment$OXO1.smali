.class public final Lcom/sma/smartv3/ui/device/Device2Fragment$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/ui/device/item/InfoItem$OXO1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/Device2Fragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDevice2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Device2Fragment.kt\ncom/sma/smartv3/ui/device/Device2Fragment$info2Item$2$1$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,389:1\n151#2,5:390\n156#2,5:396\n1#3:395\n*S KotlinDebug\n*F\n+ 1 Device2Fragment.kt\ncom/sma/smartv3/ui/device/Device2Fragment$info2Item$2$1$1\n*L\n55#1:390,5\n55#1:396,5\n55#1:395\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDevice2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Device2Fragment.kt\ncom/sma/smartv3/ui/device/Device2Fragment$info2Item$2$1$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,389:1\n151#2,5:390\n156#2,5:396\n1#3:395\n*S KotlinDebug\n*F\n+ 1 Device2Fragment.kt\ncom/sma/smartv3/ui/device/Device2Fragment$info2Item$2$1$1\n*L\n55#1:390,5\n55#1:396,5\n55#1:395\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/Device2Fragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/Device2Fragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/Device2Fragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/Device2Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    return-void

    :sswitch_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/Device2Fragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/Device2Fragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/Device2Fragment;->access$getMActivity(Lcom/sma/smartv3/ui/device/Device2Fragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i72;->OIXOXXi(Landroid/app/Activity;)V

    return-void

    :sswitch_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/Device2Fragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/Device2Fragment;

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-static {p1, v1, v1, v0, v1}, Lcom/sma/smartv3/ui/device/DeviceFragment;->toAddDevice$default(Lcom/sma/smartv3/ui/device/DeviceFragment;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :sswitch_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/Device2Fragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/Device2Fragment;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/device/Device2Fragment;->showDropDownPopup(Landroid/view/View;)V

    return-void

    :sswitch_3
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/Device2Fragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/Device2Fragment;

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const-class v2, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v1, 0x7

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    :sswitch_data_0
    .sparse-switch
        0x7f0a01d9 -> :sswitch_3
        0x7f0a0607 -> :sswitch_2
        0x7f0a0627 -> :sswitch_1
        0x7f0a18ae -> :sswitch_0
    .end sparse-switch
.end method
