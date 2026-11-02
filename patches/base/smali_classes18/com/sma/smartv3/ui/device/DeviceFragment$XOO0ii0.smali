.class public final Lcom/sma/smartv3/ui/device/DeviceFragment$XOO0ii0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/ui/device/item/InfoItem$OXO1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/DeviceFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeviceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment$infoItem$2$1$2\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3223:1\n151#2,5:3224\n156#2,5:3230\n1#3:3229\n*S KotlinDebug\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment$infoItem$2$1$2\n*L\n260#1:3224,5\n260#1:3230,5\n260#1:3229\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeviceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment$infoItem$2$1$2\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3223:1\n151#2,5:3224\n156#2,5:3230\n1#3:3229\n*S KotlinDebug\n*F\n+ 1 DeviceFragment.kt\ncom/sma/smartv3/ui/device/DeviceFragment$infoItem$2$1$2\n*L\n260#1:3224,5\n260#1:3230,5\n260#1:3229\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/DeviceFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/DeviceFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$XOO0ii0;->OXO1:Lcom/sma/smartv3/ui/device/DeviceFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a01d9

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/DeviceFragment$XOO0ii0;->OXO1:Lcom/sma/smartv3/ui/device/DeviceFragment;

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const-class v2, Lcom/sma/smartv3/ui/device/MultiDeviceManagerActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v1, 0x7

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method
