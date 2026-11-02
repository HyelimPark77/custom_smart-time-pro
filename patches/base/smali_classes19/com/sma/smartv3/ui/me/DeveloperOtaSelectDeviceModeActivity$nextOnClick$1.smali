.class public final Lcom/sma/smartv3/ui/me/DeveloperOtaSelectDeviceModeActivity$nextOnClick$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperOtaSelectDeviceModeActivity;->nextOnClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/sma/smartv3/model/FirmwareVersionList;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperOtaSelectDeviceModeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaSelectDeviceModeActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectDeviceModeActivity$nextOnClick$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n11#2,2:95\n69#3,3:97\n72#3,5:101\n1#4:100\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaSelectDeviceModeActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectDeviceModeActivity$nextOnClick$1\n*L\n81#1:95,2\n82#1:97,3\n82#1:101,5\n82#1:100\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperOtaSelectDeviceModeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaSelectDeviceModeActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectDeviceModeActivity$nextOnClick$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n11#2,2:95\n69#3,3:97\n72#3,5:101\n1#4:100\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaSelectDeviceModeActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaSelectDeviceModeActivity$nextOnClick$1\n*L\n81#1:95,2\n82#1:97,3\n82#1:101,5\n82#1:100\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/DeveloperOtaSelectDeviceModeActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperOtaSelectDeviceModeActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectDeviceModeActivity$nextOnClick$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperOtaSelectDeviceModeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/model/FirmwareVersionList;)V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/model/FirmwareVersionList;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectDeviceModeActivity$nextOnClick$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperOtaSelectDeviceModeActivity;

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectFirmwareActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x7f14011e

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/FirmwareVersionList;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperOtaSelectDeviceModeActivity$nextOnClick$1;->OXO1(Lcom/sma/smartv3/model/FirmwareVersionList;)V

    return-void
.end method
