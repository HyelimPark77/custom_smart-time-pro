.class public final Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public I0IIOi:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final IiI10X:Lcom/android/mltcode/paycertificationapi/ry0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/ry0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final O00:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final XIi00iiXO:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final XO0O10:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final XOO0ii0:Lcom/android/mltcode/paycertificationapi/l94;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/l94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final iO:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V
    .locals 3
    .param p1    # Lcom/android/mltcode/paycertificationapi/i00OIXiO;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    const-string p1, "SparkChainLicenseManager"

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->XIi00iiXO:Ljava/lang/String;

    const-string p1, "0b99355f"

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->iO:Ljava/lang/String;

    const-string p1, "9221c3ac55d4516cff992a06d82c21d6"

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->XO0O10:Ljava/lang/String;

    const-string p1, "ZTRhY2U2NzZhN2UyNWNmNGRlM2NmNjI3"

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->O00:Ljava/lang/String;

    const/4 p1, 0x0

    const/4 v0, 0x6

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v1, v2, p1, v0, p1}, Lcom/android/mltcode/paycertificationapi/m94;->XIi00iiXO(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ry0;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->IiI10X:Lcom/android/mltcode/paycertificationapi/ry0;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/iX0XiO;->I0iXXO(Lcom/android/mltcode/paycertificationapi/ry0;)Lcom/android/mltcode/paycertificationapi/l94;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->XOO0ii0:Lcom/android/mltcode/paycertificationapi/l94;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->I0IIOi:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public static final synthetic OXO1(Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->XIi00iiXO:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic XIi00iiXO(Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;)Lcom/android/mltcode/paycertificationapi/ry0;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->IiI10X:Lcom/android/mltcode/paycertificationapi/ry0;

    return-object p0
.end method

.method public static final synthetic iO(Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->I0IIOi:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method


# virtual methods
.method public final IiI10X()Z
    .locals 7

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->ii00OXXO()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->O1i0()Lcom/sma/smartv3/model/DeviceConfigInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/DeviceConfigInfo;->getMacConfig()Lcom/sma/smartv3/model/MacConfig;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/MacConfig;->getMac()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleAddress()Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, ":"

    const-string v3, ""

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->XIi00iiXO:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " DeviceId:"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {}, Lcom/iflytek/sparkchain/core/SparkChainConfig;->builder()Lcom/iflytek/sparkchain/core/SparkChainConfig;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->iO:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/iflytek/sparkchain/core/SparkChainConfig;->appID(Ljava/lang/String;)Lcom/iflytek/sparkchain/core/SparkChainConfig;

    iget-object v3, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->XO0O10:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/iflytek/sparkchain/core/SparkChainConfig;->apiKey(Ljava/lang/String;)Lcom/iflytek/sparkchain/core/SparkChainConfig;

    iget-object v3, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->O00:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/iflytek/sparkchain/core/SparkChainConfig;->apiSecret(Ljava/lang/String;)Lcom/iflytek/sparkchain/core/SparkChainConfig;

    invoke-virtual {v2, v0}, Lcom/iflytek/sparkchain/core/SparkChainConfig;->uid(Ljava/lang/String;)Lcom/iflytek/sparkchain/core/SparkChainConfig;

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/iflytek/sparkchain/core/SparkChainConfig;->logLevel(I)Lcom/iflytek/sparkchain/core/SparkChainConfig;

    sget-object v3, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->O00()Ljava/text/SimpleDateFormat;

    move-result-object v4

    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    invoke-virtual {v4, v5}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "AI_SPARK_CHAIN_"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ".txt"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/android/mltcode/paycertificationapi/uz0;->iO(Lcom/android/mltcode/paycertificationapi/sz0;Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/iflytek/sparkchain/core/SparkChainConfig;->logPath(Ljava/lang/String;)Lcom/iflytek/sparkchain/core/SparkChainConfig;

    invoke-static {}, Lcom/iflytek/sparkchain/core/SparkChain;->getInst()Lcom/iflytek/sparkchain/core/SparkChain;

    move-result-object v3

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Lcom/iflytek/sparkchain/core/SparkChain;->init(Landroid/content/Context;Lcom/iflytek/sparkchain/core/SparkChainConfig;)I

    move-result v2

    if-eqz v2, :cond_2

    const v3, 0x7f141283

    invoke-static {v3}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :cond_2
    iget-object v3, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->XIi00iiXO:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " InitStatus:"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-nez v2, :cond_3

    const/4 v0, 0x1

    :cond_3
    return v0
.end method

.method public final O00()Lcom/android/mltcode/paycertificationapi/l94;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/l94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->XOO0ii0:Lcom/android/mltcode/paycertificationapi/l94;

    return-object v0
.end method

.method public final XO0O10()Lkotlinx/coroutines/XiOIO;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager$currentDeviceHasLicense$1;

    const/4 v2, 0x0

    invoke-direct {v3, p0, v2}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager$currentDeviceHasLicense$1;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object v0

    return-object v0
.end method
