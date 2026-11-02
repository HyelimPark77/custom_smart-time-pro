.class public final Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;
.super Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sma/smartv3/ui/device/BaseListFunctionActivity<",
        "Lcom/bestmafen/baseble/scanner/BleDevice;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperOtaStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaStartActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n19#2:417\n15#2:418\n19#2:419\n15#2:420\n19#2:421\n15#2:422\n19#2:423\n15#2:424\n27#2,2:518\n11#2,2:520\n11#2,2:522\n11#2,2:524\n69#3,3:425\n72#3,5:429\n69#3,3:434\n72#3,5:438\n69#3,3:443\n72#3,5:447\n87#3,7:452\n94#3,3:460\n70#3,7:463\n97#3:470\n87#3,7:471\n94#3,3:479\n70#3,7:482\n97#3:489\n87#3,7:490\n94#3,3:498\n70#3,7:501\n97#3:508\n69#3,3:509\n72#3,5:513\n1#4:428\n1#4:437\n1#4:446\n1#4:459\n1#4:478\n1#4:497\n1#4:512\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaStartActivity\n*L\n67#1:417\n67#1:418\n70#1:419\n70#1:420\n73#1:421\n73#1:422\n205#1:423\n205#1:424\n307#1:518,2\n405#1:520,2\n406#1:522,2\n407#1:524,2\n262#1:425,3\n262#1:429,5\n264#1:434,3\n264#1:438,5\n267#1:443,3\n267#1:447,5\n274#1:452,7\n274#1:460,3\n274#1:463,7\n274#1:470\n283#1:471,7\n283#1:479,3\n283#1:482,7\n283#1:489\n289#1:490,7\n289#1:498,3\n289#1:501,7\n289#1:508\n293#1:509,3\n293#1:513,5\n262#1:428\n264#1:437\n267#1:446\n274#1:459\n283#1:478\n289#1:497\n293#1:512\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperOtaStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperOtaStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaStartActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n19#2:417\n15#2:418\n19#2:419\n15#2:420\n19#2:421\n15#2:422\n19#2:423\n15#2:424\n27#2,2:518\n11#2,2:520\n11#2,2:522\n11#2,2:524\n69#3,3:425\n72#3,5:429\n69#3,3:434\n72#3,5:438\n69#3,3:443\n72#3,5:447\n87#3,7:452\n94#3,3:460\n70#3,7:463\n97#3:470\n87#3,7:471\n94#3,3:479\n70#3,7:482\n97#3:489\n87#3,7:490\n94#3,3:498\n70#3,7:501\n97#3:508\n69#3,3:509\n72#3,5:513\n1#4:428\n1#4:437\n1#4:446\n1#4:459\n1#4:478\n1#4:497\n1#4:512\n*S KotlinDebug\n*F\n+ 1 DeveloperOtaStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperOtaStartActivity\n*L\n67#1:417\n67#1:418\n70#1:419\n70#1:420\n73#1:421\n73#1:422\n205#1:423\n205#1:424\n307#1:518,2\n405#1:520,2\n406#1:522,2\n407#1:524,2\n262#1:425,3\n262#1:429,5\n264#1:434,3\n264#1:438,5\n267#1:443,3\n267#1:447,5\n274#1:452,7\n274#1:460,3\n274#1:463,7\n274#1:470\n283#1:471,7\n283#1:479,3\n283#1:482,7\n283#1:489\n289#1:490,7\n289#1:498,3\n289#1:501,7\n289#1:508\n293#1:509,3\n293#1:513,5\n262#1:428\n264#1:437\n267#1:446\n274#1:459\n283#1:478\n289#1:497\n293#1:512\n*E\n"
    }
.end annotation


# instance fields
.field private bleFirmwareInfo:Lcom/sma/smartv3/model/BleFirmwareInfo;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btStartOta$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btStopOta$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final cbOtaFile$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final cbShutdown$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final cbSmaDowngrade$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final cbSmaUpdate$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final etBufferSize$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final etOldBleName$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final etSignal$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private extraPackageDatas:Lcom/sma/smartv3/model/ExtraPackVersions;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private firmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isStartOTA:Z

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mScanner$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mStepsIndex:I

.field private platform:I

.field private final tvAlreadyOta$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvSearchNumber$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvVersionInfo$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 15

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X1Xi1XI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X1Xi1XI;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->tvVersionInfo$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0IXiII;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O0IXiII;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->etOldBleName$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OX000iO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OX000iO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->btStartOta$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IIOO1i1i0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IIOO1i1i0;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->btStopOta$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0iOO1ii;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O0iOO1ii;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->etSignal$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IIXXXI1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IIXXXI1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->tvSearchNumber$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OiiX00;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OiiX00;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->tvAlreadyOta$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X1XIOIX1X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X1XIOIX1X;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->cbSmaUpdate$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0i1i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0i1i;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->cbSmaDowngrade$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XX1XXX1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XX1XXX1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->cbShutdown$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I1OXXIXX1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I1OXXIXX1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->cbOtaFile$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OXO1X0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OXO1X0;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->etBufferSize$delegate:Lkotlin/Lazy;

    const/4 v0, -0x1

    iput v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->mStepsIndex:I

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "TEST_MODE_SELECT_PLATFORM"

    invoke-virtual {v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->platform:I

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/model/BleFirmwareInfo;

    const/16 v8, 0x1f

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lcom/sma/smartv3/model/BleFirmwareInfo;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/sma/smartv3/model/BleFirmwareInfo;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    check-cast v2, Lcom/sma/smartv3/model/BleFirmwareInfo;

    iput-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->bleFirmwareInfo:Lcom/sma/smartv3/model/BleFirmwareInfo;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/model/FirmwareVersion;

    const/16 v13, 0x3ff

    const/4 v14, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v2 .. v14}, Lcom/sma/smartv3/model/FirmwareVersion;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    check-cast v2, Lcom/sma/smartv3/model/FirmwareVersion;

    iput-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->firmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/model/ExtraPackVersions;

    const/16 v9, 0x7f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/sma/smartv3/model/ExtraPackVersions;-><init>(Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/FirmwareVersion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/sma/smartv3/model/ExtraPackVersions;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    move-object v1, v0

    :goto_2
    check-cast v1, Lcom/sma/smartv3/model/ExtraPackVersions;

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->extraPackageDatas:Lcom/sma/smartv3/model/ExtraPackVersions;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OXi1I1OI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OXi1I1OI;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->mScanner$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity$XIi00iiXO;

    return-void
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->btStopOta_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->etOldBleName_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic II1Xi0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/CheckBox;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->cbSmaDowngrade_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/CheckBox;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->tvSearchNumber_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->etBufferSize_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/CheckBox;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->cbSmaUpdate_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/CheckBox;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->btStartOta_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->permissionBackgroundLocationRemind$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/CheckBox;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->cbOtaFile_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/CheckBox;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->tvVersionInfo_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->tvAlreadyOta_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/CheckBox;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->cbShutdown_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/CheckBox;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    return-void
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->etSignal_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getBtStartOta(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getBtStartOta()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getBtStopOta(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getBtStopOta()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getEtOldBleName(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMList(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Ljava/util/List;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMListAdapter(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Lcom/android/mltcode/paycertificationapi/XII0Oi10O;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTvSearchNumber(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getTvSearchNumber()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$isOTA(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->isOTA(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static final btStartOta_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    const v0, 0x7f0a01a6

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/AppCompatButton;

    return-object p0
.end method

.method private static final btStopOta_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    const v0, 0x7f0a01ae

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/AppCompatButton;

    return-object p0
.end method

.method private static final cbOtaFile_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/CheckBox;
    .locals 1

    const v0, 0x7f0a0211

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/CheckBox;

    return-object p0
.end method

.method private static final cbShutdown_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/CheckBox;
    .locals 1

    const v0, 0x7f0a0213

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/CheckBox;

    return-object p0
.end method

.method private static final cbSmaDowngrade_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/CheckBox;
    .locals 1

    const v0, 0x7f0a0216

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/CheckBox;

    return-object p0
.end method

.method private static final cbSmaUpdate_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/CheckBox;
    .locals 1

    const v0, 0x7f0a0217

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/CheckBox;

    return-object p0
.end method

.method private static final etBufferSize_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a036f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private static final etOldBleName_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a0377

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private static final etSignal_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a037d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private final getBtStartOta()Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->btStartOta$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatButton;

    return-object v0
.end method

.method private final getBtStopOta()Landroidx/appcompat/widget/AppCompatButton;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->btStopOta$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatButton;

    return-object v0
.end method

.method private final getCbOtaFile()Landroid/widget/CheckBox;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->cbOtaFile$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    return-object v0
.end method

.method private final getCbShutdown()Landroid/widget/CheckBox;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->cbShutdown$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    return-object v0
.end method

.method private final getCbSmaDowngrade()Landroid/widget/CheckBox;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->cbSmaDowngrade$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    return-object v0
.end method

.method private final getCbSmaUpdate()Landroid/widget/CheckBox;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->cbSmaUpdate$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    return-object v0
.end method

.method private final getEtBufferSize()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->etBufferSize$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method private final getEtOldBleName()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->etOldBleName$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method private final getEtSignal()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->etSignal$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method private final getMScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->mScanner$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    return-object v0
.end method

.method private final getTvAlreadyOta()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->tvAlreadyOta$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvSearchNumber()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->tvSearchNumber$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvVersionInfo()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->tvVersionInfo$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->mScanner_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->requestLocationPermission$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private final initOtaConfig()V
    .locals 6

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "otaConfig"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    if-eqz v0, :cond_1

    move-object v1, v0

    check-cast v1, Lcom/sma/smartv3/model/BatchOtaConfig;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "initOtaConfig -> "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/BatchOtaConfig;->getPlatform()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->platform:I

    invoke-virtual {v1}, Lcom/sma/smartv3/model/BatchOtaConfig;->getBleFirmwareInfo()Lcom/sma/smartv3/model/BleFirmwareInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->bleFirmwareInfo:Lcom/sma/smartv3/model/BleFirmwareInfo;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/BatchOtaConfig;->getFirmwareVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->firmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/BatchOtaConfig;->getExtraPackageDatas()Lcom/sma/smartv3/model/ExtraPackVersions;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->extraPackageDatas:Lcom/sma/smartv3/model/ExtraPackVersions;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/BatchOtaConfig;->getBleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v1}, Lcom/sma/smartv3/model/BatchOtaConfig;->getBleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    iget v3, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->platform:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-class v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v5, v3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->firmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    const-class v4, Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v5, v3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->extraPackageDatas:Lcom/sma/smartv3/model/ExtraPackVersions;

    const-class v3, Lcom/sma/smartv3/model/ExtraPackVersions;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v4, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getCbOtaFile()Landroid/widget/CheckBox;

    move-result-object v0

    invoke-virtual {v1}, Lcom/sma/smartv3/model/BatchOtaConfig;->isLocalOta()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    :cond_1
    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object p1

    sget-object p2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p4

    invoke-interface {p4, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-virtual {p3}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/android/mltcode/paycertificationapi/q62;->iOO1ii1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object p1

    const-string p2, "<get-etOldBleName>(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->startSearch(Landroid/view/View;)V

    return-void
.end method

.method private final isOTA(Ljava/lang/String;)Z
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "DEVELOPER_UPDATE_BLE_NAME"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "OTA_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private static final mScanner_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/ut3;->OXO1:Lcom/android/mltcode/paycertificationapi/ut3;

    sget-object v1, Lcom/bestmafen/baseble/scanner/ScanMode;->LOW_LATENCY:Lcom/bestmafen/baseble/scanner/ScanMode;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/ut3;->XIi00iiXO(Lcom/android/mltcode/paycertificationapi/ut3;[Ljava/util/UUID;Lcom/bestmafen/baseble/scanner/ScanMode;ILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->IIX1OXO(I)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity$iO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity$iO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XiOIO(Lcom/android/mltcode/paycertificationapi/OOXIOIiOO;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity$XO0O10;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity$XO0O10;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->X1ii(Lcom/android/mltcode/paycertificationapi/i1OIOOIiX;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p0

    return-object p0
.end method

.method private final permissionBackgroundLocationRemind()V
    .locals 4
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1d
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;->getMPermissionBackgroundPopup()Lcom/android/mltcode/paycertificationapi/go0;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f1401a9

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1, v3, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iOIX0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/iOIX0;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)V

    const v2, 0x7f14122c

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;->setMPermissionBackgroundPopup(Lcom/android/mltcode/paycertificationapi/go0;)V

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;->getMPermissionBackgroundPopup()Lcom/android/mltcode/paycertificationapi/go0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;->getRootView()Landroid/view/View;

    move-result-object v1

    const-string v2, "<get-rootView>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method private static final permissionBackgroundLocationRemind$lambda$0$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p0

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    const-string v1, "android.permission.ACCESS_BACKGROUND_LOCATION"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    const/4 p0, 0x1

    return p0
.end method

.method private final requestEnableBluetooth()V
    .locals 6

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "android.bluetooth.adapter.action.REQUEST_ENABLE"

    const/4 v2, 0x1

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/X1OOO;->IIX1OXO(Landroid/app/Activity;Ljava/lang/String;IIILjava/lang/Object;)V

    return-void
.end method

.method private final requestLocationPermission()V
    .locals 7

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->permissionBackgroundLocationRemind()V

    return-void

    :cond_0
    const-string v0, "LOCATION"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object v1

    const-string v0, "permission(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lcom/android/mltcode/paycertificationapi/XXiXii1i;

    invoke-direct {v4, p0}, Lcom/android/mltcode/paycertificationapi/XXiXii1i;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/ds1;->iO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method private static final requestLocationPermission$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity$OXO1;->OXO1:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;->permissionRemind()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->requestLocationPermission()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getTvVersionInfo()Landroid/widget/TextView;

    move-result-object p1

    const-string v0, "<get-tvVersionInfo>(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->startSearch(Landroid/view/View;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final tvAlreadyOta_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c2e

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvSearchNumber_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0d05

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvVersionInfo_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a18b2

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final clearOtaHistory(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-class v0, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getTvAlreadyOta()Landroid/widget/TextView;

    move-result-object p1

    const-string v0, "0"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object p1

    const-string v0, "<get-etOldBleName>(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->startSearch(Landroid/view/View;)V

    return-void
.end method

.method public final getBleFirmwareInfo()Lcom/sma/smartv3/model/BleFirmwareInfo;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->bleFirmwareInfo:Lcom/sma/smartv3/model/BleFirmwareInfo;

    return-object v0
.end method

.method public final getExtraPackageDatas()Lcom/sma/smartv3/model/ExtraPackVersions;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->extraPackageDatas:Lcom/sma/smartv3/model/ExtraPackVersions;

    return-object v0
.end method

.method public final getFirmwareVersion()Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->firmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object v0
.end method

.method public final getPlatform()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->platform:I

    return v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity$XIi00iiXO;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/bestmafen/baseble/scanner/BleDevice;I)V
    .locals 1
    .param p1    # Lcom/android/mltcode/paycertificationapi/ug6;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/bestmafen/baseble/scanner/BleDevice;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMName()Ljava/lang/String;

    move-result-object p3

    const v0, 0x7f0a0cc7

    invoke-virtual {p1, v0, p3}, Lcom/android/mltcode/paycertificationapi/ug6;->OII(ILjava/lang/String;)Lcom/android/mltcode/paycertificationapi/ug6;

    .line 3
    invoke-virtual {p2}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMBluetoothDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p3

    invoke-virtual {p3}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p3

    const v0, 0x7f0a0c24

    invoke-virtual {p1, v0, p3}, Lcom/android/mltcode/paycertificationapi/ug6;->OII(ILjava/lang/String;)Lcom/android/mltcode/paycertificationapi/ug6;

    const p3, 0x7f0a066a

    .line 4
    invoke-virtual {p1, p3}, Lcom/android/mltcode/paycertificationapi/ug6;->O00(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p2}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMRssi()I

    move-result p2

    neg-int p2, p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageLevel(I)V

    return-void
.end method

.method public bridge synthetic initItem(Lcom/android/mltcode/paycertificationapi/ug6;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/bestmafen/baseble/scanner/BleDevice;I)V

    return-void
.end method

.method public initList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/bestmafen/baseble/scanner/BleDevice;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public initView()V
    .locals 21

    move-object/from16 v0, p0

    invoke-super {v0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->initView()V

    const/4 v1, -0x1

    iput v1, v0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->mStepsIndex:I

    invoke-direct {v0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->initOtaConfig()V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, v0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->bleFirmwareInfo:Lcom/sma/smartv3/model/BleFirmwareInfo;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "bleFirmwareInfo -> "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->firmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "FirmwareVersion -> "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->extraPackageDatas:Lcom/sma/smartv3/model/ExtraPackVersions;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ExtraPackVersion -> "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getBtStartOta()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getBtStopOta()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getCbShutdown()Landroid/widget/CheckBox;

    move-result-object v1

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Landroid/widget/CompoundButton;->setChecked(Z)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->extraPackageDatas:Lcom/sma/smartv3/model/ExtraPackVersions;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/ExtraPackVersions;->getUiPackVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v1

    iget-object v4, v0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->extraPackageDatas:Lcom/sma/smartv3/model/ExtraPackVersions;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/ExtraPackVersions;->getLanguagePackVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v4

    iget-object v5, v0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->extraPackageDatas:Lcom/sma/smartv3/model/ExtraPackVersions;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/ExtraPackVersions;->getBrandPackVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v5

    iget-object v6, v0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->extraPackageDatas:Lcom/sma/smartv3/model/ExtraPackVersions;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/ExtraPackVersions;->getFontPackVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v6

    iget-object v7, v0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->extraPackageDatas:Lcom/sma/smartv3/model/ExtraPackVersions;

    invoke-virtual {v7}, Lcom/sma/smartv3/model/ExtraPackVersions;->getDialPackVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v7

    invoke-direct {v0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getTvVersionInfo()Landroid/widget/TextView;

    move-result-object v8

    iget-object v9, v0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->bleFirmwareInfo:Lcom/sma/smartv3/model/BleFirmwareInfo;

    invoke-virtual {v9}, Lcom/sma/smartv3/model/BleFirmwareInfo;->getBleName()Ljava/lang/String;

    move-result-object v9

    iget-object v10, v0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->bleFirmwareInfo:Lcom/sma/smartv3/model/BleFirmwareInfo;

    invoke-virtual {v10}, Lcom/sma/smartv3/model/BleFirmwareInfo;->getFlag()Ljava/lang/String;

    move-result-object v10

    iget-object v11, v0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->bleFirmwareInfo:Lcom/sma/smartv3/model/BleFirmwareInfo;

    invoke-virtual {v11}, Lcom/sma/smartv3/model/BleFirmwareInfo;->getRemark()Ljava/lang/String;

    move-result-object v11

    iget-object v12, v0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->firmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v12}, Lcom/sma/smartv3/model/FirmwareVersion;->getInfo()Ljava/lang/String;

    move-result-object v12

    iget-object v13, v0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->firmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v13}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v13

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/model/FirmwareVersion;->getInfo()Ljava/lang/String;

    move-result-object v15

    goto :goto_0

    :cond_0
    const/4 v15, 0x0

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lcom/sma/smartv3/model/FirmwareVersion;->getInfo()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v2, v16

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v4

    goto :goto_3

    :cond_3
    const/4 v4, 0x0

    :goto_3
    if-eqz v5, :cond_4

    invoke-virtual {v5}, Lcom/sma/smartv3/model/FirmwareVersion;->getInfo()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v3, v17

    goto :goto_4

    :cond_4
    const/4 v3, 0x0

    :goto_4
    if-eqz v5, :cond_5

    invoke-virtual {v5}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v18

    move-object/from16 v14, v18

    goto :goto_5

    :cond_5
    const/4 v14, 0x0

    :goto_5
    if-eqz v6, :cond_6

    invoke-virtual {v6}, Lcom/sma/smartv3/model/FirmwareVersion;->getInfo()Ljava/lang/String;

    move-result-object v19

    move-object/from16 v20, v19

    move-object/from16 v19, v5

    move-object/from16 v5, v20

    goto :goto_6

    :cond_6
    move-object/from16 v19, v5

    const/4 v5, 0x0

    :goto_6
    if-eqz v6, :cond_7

    invoke-virtual {v6}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v6

    goto :goto_7

    :cond_7
    const/4 v6, 0x0

    :goto_7
    if-eqz v7, :cond_8

    invoke-virtual {v7}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v7

    goto :goto_8

    :cond_8
    const/4 v7, 0x0

    :goto_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v18, v8

    const-string v8, " BleName = "

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " , firmwareFlag = "

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " ,  remark = "

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "  , firmwareInfo = "

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " ,  firmwareVersion = "

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "  , UiPackageInfo = "

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "  , UiPackageVersion = "

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " , LanguagePackageInfo =  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  , LanguagePackageVersion = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " , BrandPackVersion =  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  , BrandPackageVersion = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " , FontPackVersion =  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  , FontPackageVersion = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", DialPackVersion = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct/range {p0 .. p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getTvVersionInfo()Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Landroid/text/method/ScrollingMovementMethod;

    invoke-direct {v1}, Landroid/text/method/ScrollingMovementMethod;-><init>()V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    invoke-virtual/range {p0 .. p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListView()Landroid/widget/ListView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XX111i;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Lcom/android/mltcode/paycertificationapi/XX111i;-><init>(Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    invoke-direct {v2}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getCbShutdown()Landroid/widget/CheckBox;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v19, :cond_9

    const/4 v3, 0x1

    goto :goto_9

    :cond_9
    move v3, v1

    :goto_9
    invoke-virtual {v0, v3}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-direct {v2}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getCbSmaUpdate()Landroid/widget/CheckBox;

    move-result-object v0

    iget v3, v2, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->platform:I

    if-nez v3, :cond_a

    move v3, v1

    goto :goto_a

    :cond_a
    const/16 v3, 0x8

    :goto_a
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {v2}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getCbSmaDowngrade()Landroid/widget/CheckBox;

    move-result-object v0

    iget v3, v2, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->platform:I

    if-nez v3, :cond_b

    goto :goto_b

    :cond_b
    const/16 v1, 0x8

    :goto_b
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public itemLayoutId()I
    .locals 1

    const v0, 0x7f0d0ed7

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0076

    return v0
.end method

.method public onAttachedToWindow()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onAttachedToWindow()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object v0

    const-string v1, "<get-etOldBleName>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->startSearch(Landroid/view/View;)V

    return-void
.end method

.method public final onCopy(Landroid/view/View;)V
    .locals 8
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/model/BatchOtaConfig;

    iget v2, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->platform:I

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->bleFirmwareInfo:Lcom/sma/smartv3/model/BleFirmwareInfo;

    iget-object v4, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->firmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    iget-object v5, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->extraPackageDatas:Lcom/sma/smartv3/model/ExtraPackVersions;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getCbOtaFile()Landroid/widget/CheckBox;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v7

    invoke-direct/range {v1 .. v7}, Lcom/sma/smartv3/model/BatchOtaConfig;-><init>(ILcom/sma/smartv3/model/BleFirmwareInfo;Lcom/sma/smartv3/model/FirmwareVersion;Lcom/sma/smartv3/model/ExtraPackVersions;Ljava/lang/String;Z)V

    new-instance p1, Lcom/google/gson/Gson;

    invoke-direct {p1}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {p1, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toJson(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/text/Charsets;->XIi00iiXO:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string v0, "getBytes(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/blankj/utilcode/util/EncodeUtils;->base64Encode2String([B)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/ClipboardUtils;->copyText(Ljava/lang/CharSequence;)V

    const v0, 0x7f140363

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onCopyConfig -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BaseBleConnector;->setOtaMode(Z)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity$XIi00iiXO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getMScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XIi00iiXO()V

    return-void
.end method

.method public onResume()V
    .locals 6

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getTvAlreadyOta()Landroid/widget/TextView;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4, v3}, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;-><init>(Ljava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    check-cast v2, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;->XO0O10()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->isStartOTA:Z

    if-eqz v0, :cond_1

    const v0, 0x7f140187

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->isStartOTA:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object v0

    const-string v1, "<get-etOldBleName>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->startSearch(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public final setBleFirmwareInfo(Lcom/sma/smartv3/model/BleFirmwareInfo;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/BleFirmwareInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->bleFirmwareInfo:Lcom/sma/smartv3/model/BleFirmwareInfo;

    return-void
.end method

.method public final setExtraPackageDatas(Lcom/sma/smartv3/model/ExtraPackVersions;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/ExtraPackVersions;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->extraPackageDatas:Lcom/sma/smartv3/model/ExtraPackVersions;

    return-void
.end method

.method public final setFirmwareVersion(Lcom/sma/smartv3/model/FirmwareVersion;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->firmwareVersion:Lcom/sma/smartv3/model/FirmwareVersion;

    return-void
.end method

.method public final setPlatform(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->platform:I

    return-void
.end method

.method public final startOta(Landroid/view/View;)V
    .locals 11
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x7f141001

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "DEVELOPER_AUTO_UPDATE"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getCbShutdown()Landroid/widget/CheckBox;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    const-string v3, "DEVELOPER_AUTO_SHUTDOWN"

    invoke-virtual {v0, v3, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getCbOtaFile()Landroid/widget/CheckBox;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    const-string v3, "DEVELOPER_OTA_FILE"

    invoke-virtual {v0, v3, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getEtBufferSize()Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    goto :goto_0

    :cond_1
    const-wide/16 v3, 0x3fa

    :goto_0
    const-string v1, "DEVELOPER_BUFFER_SIZE"

    invoke-virtual {v0, v1, v3, v4}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    iput-boolean v2, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->isStartOTA:Z

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v1

    const/4 v3, 0x0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-virtual {v1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMBluetoothDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    const-string v4, "TEST_MODE_OTA_DEVICE_ADDRESS"

    invoke-virtual {v0, v4, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget v0, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->platform:I

    if-eqz v0, :cond_7

    const/4 v1, 0x2

    const-string v4, "mArg3"

    const-string v5, "mArg2"

    const-string v6, "mArg0"

    const/4 v7, 0x0

    if-eq v0, v2, :cond_5

    if-eq v0, v1, :cond_5

    const/4 v8, 0x4

    if-eq v0, v8, :cond_5

    const/4 v1, 0x5

    const-string v8, "mArg1"

    if-eq v0, v1, :cond_4

    const/4 p1, 0x6

    if-eq v0, p1, :cond_3

    const/4 p1, 0x7

    if-eq v0, p1, :cond_2

    return-void

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getBtStopOta()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_3
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getBtStopOta()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    iget p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->mStepsIndex:I

    add-int/2addr p1, v2

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->mStepsIndex:I

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {p1, v3}, Lcom/szabh/smable3/component/BaseBleConnector;->setOtaMode(Z)V

    iget p1, p0, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->mStepsIndex:I

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0, v6, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v8, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v0, v5, v7}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v0, v4, v7}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_4
    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0, v3}, Lcom/szabh/smable3/component/BaseBleConnector;->setOtaMode(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getBtStopOta()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-virtual {v1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v2, "DEVELOPER_UPDATE_BLE_NAME"

    const-string v9, ""

    invoke-virtual {p1, v2, v9}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-virtual {v2}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->isOTA(Ljava/lang/String;)Z

    move-result v2

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "start -> "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->isOTA(Ljava/lang/String;)Z

    move-result p1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0, v6, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v8, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v0, v5, v7}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v0, v4, v7}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_5
    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {p1, v2}, Lcom/szabh/smable3/component/BaseBleConnector;->setOtaMode(Z)V

    const v0, 0x7f1414b6

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-virtual {v0}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMName()Ljava/lang/String;

    move-result-object v0

    const-string v8, "Goodix_Fast_DFU"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p1, v6, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v5, v7}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {p1, v4, v7}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGQActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_6
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-static {p1, v0, v3, v1, v7}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setBleDevice$default(Lcom/bestmafen/baseble/connector/AbsBleConnector;Lcom/bestmafen/baseble/scanner/BleDevice;IILjava/lang/Object;)Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    return-void

    :cond_7
    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {p1, v3}, Lcom/szabh/smable3/component/BaseBleConnector;->setOtaMode(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getBtStopOta()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->Oiii()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bestmafen/baseble/scanner/BleDevice;

    invoke-virtual {v1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/q62;->iOO1ii1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    const-class v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;

    if-nez p1, :cond_9

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getCbSmaUpdate()Landroid/widget/CheckBox;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_8

    goto :goto_1

    :cond_8
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_9
    :goto_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getCbSmaDowngrade()Landroid/widget/CheckBox;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_a

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_a
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final startSearch(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "android.permission.ACCESS_FINE_LOCATION"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/PermissionUtils;->isGranted([Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->requestLocationPermission()V

    return-void

    :cond_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->requestEnableBluetooth()V

    return-void

    :cond_1
    invoke-static {}, Lcom/sma/smartv3/util/UtilsKt;->X1()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseListFunctionActivity;->locationServerRemind()V

    return-void

    :cond_2
    const p1, 0x7f1411e0

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getEtSignal()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getEtSignal()Landroid/widget/EditText;

    move-result-object p1

    const-string v0, "60"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getEtSignal()Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    neg-int v1, v1

    const-string v2, "DEVELOPER_SIGNAL_VALUE"

    invoke-virtual {v0, v2, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getEtOldBleName()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DEVELOPER_UPDATE_BLE_NAME"

    invoke-virtual {p1, v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getTvSearchNumber()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const v1, 0x7f1403fb

    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getMScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XXI(Z)V

    return-void
.end method

.method public final stopOta(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x7f1402f0

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "DEVELOPER_AUTO_UPDATE"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperOtaStartActivity;->getBtStopOta()Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
