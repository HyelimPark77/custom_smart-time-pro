.class public final Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$iO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/OOXIOIiOO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperTestInfoSetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperTestInfoSetActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$mScanner$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,392:1\n1#2:393\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperTestInfoSetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperTestInfoSetActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$mScanner$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,392:1\n1#2:393\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/bestmafen/baseble/scanner/BleDevice;)Z
    .locals 9

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "DEVELOPER_UPDATE_BLE_NAME"

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "getString(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v4, 0x1

    const/16 v5, -0x64

    const-string v6, "DEVELOPER_SIGNAL_VALUE"

    const/4 v7, 0x0

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMRssi()I

    move-result p1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-virtual {v0, v6, v5}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-le p1, v0, :cond_0

    return v4

    :cond_0
    return v7

    :cond_1
    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMRssi()I

    move-result v1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v8

    invoke-virtual {v8, v6, v5}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v5

    if-le v1, v5, :cond_3

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/q62;->iOO1ii1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->access$getMConnectedFailMap$p(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Ljava/util/HashMap;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->access$getDeviceAddress$p(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :cond_2
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    const/16 v0, 0x8

    if-ge p1, v0, :cond_3

    return v4

    :cond_3
    return v7
.end method
