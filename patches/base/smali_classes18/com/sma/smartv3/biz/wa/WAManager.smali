.class public final Lcom/sma/smartv3/biz/wa/WAManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWAManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WAManager.kt\ncom/sma/smartv3/biz/wa/WAManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,1031:1\n15#2:1032\n*S KotlinDebug\n*F\n+ 1 WAManager.kt\ncom/sma/smartv3/biz/wa/WAManager\n*L\n773#1:1032\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWAManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WAManager.kt\ncom/sma/smartv3/biz/wa/WAManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,1031:1\n15#2:1032\n*S KotlinDebug\n*F\n+ 1 WAManager.kt\ncom/sma/smartv3/biz/wa/WAManager\n*L\n773#1:1032\n*E\n"
    }
.end annotation


# static fields
.field public static final I0IIOi:Ljava/io/File;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static volatile I0iXXO:Z = false

.field public static final I1XOi1:Landroid/os/Handler;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final IIX1OXO:Lcom/sma/smartv3/biz/wa/WAManager$mBleHandleCallback$1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static IO:Lcom/android/mltcode/paycertificationapi/ki1; = null
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public static final IiI10X:Ljava/io/File;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final O00:Ljava/io/File;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static O10IXXX0X:Ljava/io/PipedOutputStream; = null
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public static OIX0iXi:Lcom/android/mltcode/paycertificationapi/bo4; = null
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public static OIi0:Z = false

.field public static final OXO1:Lcom/sma/smartv3/biz/wa/WAManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static X0O:Lcom/sma/smartv3/biz/voice/OpusManager; = null
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public static X1ii:Ljava/io/PipedInputStream; = null
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public static final XIi00iiXO:Ljava/lang/String; = "WAManager"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static XO0O10:Landroid/app/Application; = null

.field public static final XOO0ii0:Ljava/io/File;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static XX0:Lkotlinx/coroutines/XiOIO; = null
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public static XXI:Lcom/baidu/ai/speech/realtime/full/connection/Runner; = null
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public static XiOIO:Lcom/sma/smartv3/biz/wa/WAManager$OXO1; = null
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static iIiiO:Lkotlinx/coroutines/XiOIO; = null
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public static final iO:Ljava/lang/String; = "THISISMYSECURETOKEN"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/biz/wa/WAManager;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/wa/WAManager;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/wa/WAManager;->OXO1:Lcom/sma/smartv3/biz/wa/WAManager;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    const-string v1, "wa_opus.ogg"

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/uz0;->iO(Lcom/android/mltcode/paycertificationapi/sz0;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    sput-object v1, Lcom/sma/smartv3/biz/wa/WAManager;->O00:Ljava/io/File;

    const-string v1, "wa_opus.pcm"

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/uz0;->iO(Lcom/android/mltcode/paycertificationapi/sz0;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    sput-object v1, Lcom/sma/smartv3/biz/wa/WAManager;->IiI10X:Ljava/io/File;

    const-string v1, "wa_opus.wav"

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/uz0;->iO(Lcom/android/mltcode/paycertificationapi/sz0;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    sput-object v1, Lcom/sma/smartv3/biz/wa/WAManager;->XOO0ii0:Ljava/io/File;

    const-string v1, "wa_opus.json"

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/uz0;->iO(Lcom/android/mltcode/paycertificationapi/sz0;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/biz/wa/WAManager;->I0IIOi:Ljava/io/File;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/sma/smartv3/biz/wa/WAManager;->I1XOi1:Landroid/os/Handler;

    new-instance v0, Lcom/sma/smartv3/biz/wa/WAManager$mBleHandleCallback$1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/wa/WAManager$mBleHandleCallback$1;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/wa/WAManager;->IIX1OXO:Lcom/sma/smartv3/biz/wa/WAManager$mBleHandleCallback$1;

    new-instance v0, Lcom/sma/smartv3/biz/wa/WAManager$OXO1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/wa/WAManager$OXO1;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/wa/WAManager;->XiOIO:Lcom/sma/smartv3/biz/wa/WAManager$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic I0IIOi()Ljava/io/PipedInputStream;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/wa/WAManager;->X1ii:Ljava/io/PipedInputStream;

    return-object v0
.end method

.method public static final synthetic I0iXXO(Lcom/sma/smartv3/biz/wa/WAManager;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->XXO()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic I1XOi1(Lcom/baidu/ai/speech/realtime/full/connection/Runner;)V
    .locals 0

    sput-object p0, Lcom/sma/smartv3/biz/wa/WAManager;->XXI:Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    return-void
.end method

.method public static final synthetic IIX1OXO(Ljava/io/PipedInputStream;)V
    .locals 0

    sput-object p0, Lcom/sma/smartv3/biz/wa/WAManager;->X1ii:Ljava/io/PipedInputStream;

    return-void
.end method

.method public static final synthetic IO()Lcom/sma/smartv3/biz/voice/OpusManager;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/wa/WAManager;->X0O:Lcom/sma/smartv3/biz/voice/OpusManager;

    return-object v0
.end method

.method public static final synthetic IiI10X()Lcom/baidu/ai/speech/realtime/full/connection/Runner;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/wa/WAManager;->XXI:Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    return-object v0
.end method

.method public static synthetic IiiXiI0I(Lcom/sma/smartv3/biz/wa/WAManager;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/wa/WAManager;->IXI(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic O00(Lcom/sma/smartv3/biz/wa/WAManager;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->XXIIO1i11()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic O10IXXX0X(Lcom/sma/smartv3/biz/wa/WAManager;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/wa/WAManager;->iOiXi11II(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic OIX0iXi()Lcom/android/mltcode/paycertificationapi/bo4;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/wa/WAManager;->OIX0iXi:Lcom/android/mltcode/paycertificationapi/bo4;

    return-object v0
.end method

.method public static final synthetic OIi0()Lcom/android/mltcode/paycertificationapi/ki1;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/wa/WAManager;->IO:Lcom/android/mltcode/paycertificationapi/ki1;

    return-object v0
.end method

.method public static final OX(Z)Lkotlin/Unit;
    .locals 1

    if-eqz p0, :cond_1

    sget-object p0, Lcom/sma/smartv3/biz/wa/WAManager;->OIX0iXi:Lcom/android/mltcode/paycertificationapi/bo4;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/bo4;->XOO0ii0()Z

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/sma/smartv3/biz/wa/WAManager;->OXO1:Lcom/sma/smartv3/biz/wa/WAManager;

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->X11I()V

    :goto_0
    sget-object p0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "WAManager checkLoginStatus \u5df2\u767b"

    invoke-virtual {p0, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p0, Lcom/sma/smartv3/biz/wa/WAManager;->OXO1:Lcom/sma/smartv3/biz/wa/WAManager;

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->Ii0X0X()V

    goto :goto_1

    :cond_1
    sget-object p0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "WAManager checkLoginStatus \u672a\u767b\u5f55"

    invoke-virtual {p0, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p0, Lcom/sma/smartv3/biz/wa/WAManager;->OXO1:Lcom/sma/smartv3/biz/wa/WAManager;

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->i11I()V

    :goto_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic OX110i(Lcom/sma/smartv3/biz/wa/WAManager;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/wa/WAManager;->XX1Oi(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic OXO1(Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->OX(Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic OiIIX101O(Z)V
    .locals 0

    sput-boolean p0, Lcom/sma/smartv3/biz/wa/WAManager;->OIi0:Z

    return-void
.end method

.method public static synthetic X00XIX1(Lcom/sma/smartv3/biz/wa/WAManager;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object p1

    const p2, 0x7f141196

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "getString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/wa/WAManager;->iOiXi11II(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/biz/wa/WAManager;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/wa/WAManager;->iOOX010X(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic X0O(Lcom/sma/smartv3/biz/wa/WAManager;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/wa/WAManager;->XXiIiX10(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic X0i1O(Lcom/sma/smartv3/biz/wa/WAManager;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/wa/WAManager;->X1IX(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic X1ii(Lcom/sma/smartv3/biz/wa/WAManager;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->OO()V

    return-void
.end method

.method public static final synthetic XIi00iiXO(Lcom/sma/smartv3/biz/wa/WAManager;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->I1()Z

    move-result p0

    return p0
.end method

.method public static final synthetic XO0O10(Lcom/sma/smartv3/biz/wa/WAManager;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->iOO1ii1()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic XOO0ii0()Landroid/os/Handler;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/wa/WAManager;->I1XOi1:Landroid/os/Handler;

    return-object v0
.end method

.method public static final synthetic XX0(Z)V
    .locals 0

    sput-boolean p0, Lcom/sma/smartv3/biz/wa/WAManager;->I0iXXO:Z

    return-void
.end method

.method public static final synthetic XXI()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/biz/wa/WAManager;->I0iXXO:Z

    return v0
.end method

.method public static final synthetic XiOIO(Lcom/android/mltcode/paycertificationapi/ki1;)V
    .locals 0

    sput-object p0, Lcom/sma/smartv3/biz/wa/WAManager;->IO:Lcom/android/mltcode/paycertificationapi/ki1;

    return-void
.end method

.method public static final synthetic XiOIii1(Lcom/sma/smartv3/biz/wa/WAManager;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->iiIOiX()V

    return-void
.end method

.method public static final synthetic iIiiO(Ljava/io/PipedOutputStream;)V
    .locals 0

    sput-object p0, Lcom/sma/smartv3/biz/wa/WAManager;->O10IXXX0X:Ljava/io/PipedOutputStream;

    return-void
.end method

.method public static final synthetic iO(Lcom/sma/smartv3/biz/wa/WAManager;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->IXXOO()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final I1()Z
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->II1Xi0()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WAManager checkLoginStatusBlock -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v1, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    new-instance v2, Lcom/sma/smartv3/biz/wa/WAManager$checkLoginStatusBlock$1;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lcom/sma/smartv3/biz/wa/WAManager$checkLoginStatusBlock$1;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/coroutines/Continuation;)V

    const/4 v0, 0x1

    invoke-static {v3, v2, v0, v3}, Lcom/android/mltcode/paycertificationapi/I100X1;->XOO0ii0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, v1, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    return v0
.end method

.method public final II1Xi0()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleAddress()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WA_AUTH_TOKEN_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final IO0II0i(Ljava/lang/String;Ljava/io/File;)V
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/io/File;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "toUser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "file"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->II1Xi0()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-boolean v2, Lcom/sma/smartv3/biz/wa/WAManager;->OIi0:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "WAManager sendVoice -> "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-boolean v2, Lcom/sma/smartv3/biz/wa/WAManager;->OIi0:Z

    if-nez v2, :cond_1

    invoke-static {p2}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_0

    :cond_0
    const/4 v1, 0x1

    sput-boolean v1, Lcom/sma/smartv3/biz/wa/WAManager;->OIi0:Z

    invoke-static {p2}, Lcom/blankj/utilcode/util/FileIOUtils;->readFile2BytesByChannel(Ljava/io/File;)[B

    move-result-object p2

    const/4 v1, 0x2

    invoke-static {p2, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "{\"phone\": \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\",\"isGroup\": false,\"base64Ptt\": \""

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\"}"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lcom/sma/smartv3/biz/wa/WAManager;->I0IIOi:Ljava/io/File;

    invoke-static {p2, p1}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromString(Ljava/io/File;Ljava/lang/String;)Z

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->O001I()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p2

    const-string v1, "application/json"

    invoke-virtual {p2, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setContentType(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Bearer "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Authorization"

    invoke-virtual {p2, v1, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addHeaders(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p2

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {v0}, Lcom/sma/smartv3/network/NetWorkUtils;->getHeadersMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addHeaders(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p2

    sget-object v0, Lkotlin/text/Charsets;->XIi00iiXO:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string v0, "getBytes(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addByteBody([B)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->O001I()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object p2, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    const-class p2, Lcom/sma/smartv3/biz/wa/data/WAResponse;

    invoke-static {p2}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p2

    new-instance v0, Lcom/sma/smartv3/biz/wa/WAManager$sendVoice$1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/wa/WAManager$sendVoice$1;-><init>()V

    invoke-virtual {p1, p2, v0}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void

    :cond_1
    :goto_0
    const-string p1, "WAManager sendVoice -> sending, please wait"

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public final IXI(Lkotlin/jvm/functions/Function1;)V
    .locals 7
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->XOO0XOOii()V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/I0IIOi;->OXO1(Lkotlin/coroutines/CoroutineContext;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v1

    new-instance v4, Lcom/sma/smartv3/biz/wa/WAManager$startPollingGetLoginQrCode$1;

    const/4 v0, 0x0

    invoke-direct {v4, p1, v0}, Lcom/sma/smartv3/biz/wa/WAManager$startPollingGetLoginQrCode$1;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object p1

    sput-object p1, Lcom/sma/smartv3/biz/wa/WAManager;->iIiiO:Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public final IXOIIIO(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 14
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v10, p6

    const-string v0, "fromUserId"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fromUserName"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toUserId"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toUserName"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WAManager sendTextMessageToDevice -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", f:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", t:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v11, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v12, Lcom/szabh/smable3/BleKey;->CHAT_MESSAGE:Lcom/szabh/smable3/BleKey;

    sget-object v13, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v0, Lcom/szabh/smable3/entity/BleChatMessage;

    const/4 v1, 0x6

    const/4 v2, 0x0

    move v3, p1

    move-wide/from16 v8, p7

    invoke-direct/range {v0 .. v10}, Lcom/szabh/smable3/entity/BleChatMessage;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    const/16 p1, 0x18

    const/4 v1, 0x0

    const/4 v3, 0x0

    move/from16 p7, p1

    move-object/from16 p4, v0

    move-object/from16 p8, v1

    move/from16 p5, v2

    move/from16 p6, v3

    move-object p1, v11

    move-object/from16 p2, v12

    move-object/from16 p3, v13

    invoke-static/range {p1 .. p8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    return-void
.end method

.method public final IXXOO()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->i010I()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->XXO()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "https://"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/whatsapp/api/"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/start-session"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final Ii0X0X()V
    .locals 14

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->iIXi1iiXI()Lcom/sma/smartv3/biz/wa/data/WAUserInfo;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v2, "WAManager sendLoginSuccessToDevice"

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v3, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v4, Lcom/szabh/smable3/BleKey;->CHAT_APP:Lcom/szabh/smable3/BleKey;

    sget-object v5, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v6, Lcom/szabh/smable3/entity/BleChatApp;

    const-string v1, ""

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/wa/data/WAUserInfo;->getPhoneNumber()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v9, v2

    goto :goto_1

    :cond_1
    :goto_0
    move-object v9, v1

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/wa/data/WAUserInfo;->getPushname()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    move-object v10, v0

    goto :goto_3

    :cond_3
    :goto_2
    move-object v10, v1

    :goto_3
    const/16 v12, 0x10

    const/4 v13, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x5

    const/4 v11, 0x0

    invoke-direct/range {v6 .. v13}, Lcom/szabh/smable3/entity/BleChatApp;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v9, 0x18

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v10}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    return-void
.end method

.method public final Ii0i()V
    .locals 7

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->XOXiX0()V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/I0IIOi;->OXO1(Lkotlin/coroutines/CoroutineContext;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v1

    new-instance v4, Lcom/sma/smartv3/biz/wa/WAManager$startPollingCheckLoginStatus$1;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lcom/sma/smartv3/biz/wa/WAManager$startPollingCheckLoginStatus$1;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/biz/wa/WAManager;->XX0:Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public final Ii1iii0(Landroid/app/Application;)V
    .locals 2
    .param p1    # Landroid/app/Application;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "app"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "WAManager -> init"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sput-object p1, Lcom/sma/smartv3/biz/wa/WAManager;->XO0O10:Landroid/app/Application;

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v0, Lcom/sma/smartv3/biz/wa/WAManager;->IIX1OXO:Lcom/sma/smartv3/biz/wa/WAManager$mBleHandleCallback$1;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object p1, Lcom/sma/smartv3/biz/wa/WAManager;->X0O:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-nez p1, :cond_0

    :try_start_0
    new-instance p1, Lcom/sma/smartv3/biz/voice/OpusManager;

    invoke-direct {p1}, Lcom/sma/smartv3/biz/voice/OpusManager;-><init>()V

    sput-object p1, Lcom/sma/smartv3/biz/wa/WAManager;->X0O:Lcom/sma/smartv3/biz/voice/OpusManager;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "WAManager -> opus init error\uff01\uff01\uff01"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final O001I()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->i010I()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->XXO()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "https://"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/whatsapp/api/"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/send-voice-base64"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final O1O()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->i010I()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->XXO()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "https://"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/whatsapp/api/"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/logout-session"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final OII()V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v1, Lcom/sma/smartv3/biz/wa/WAManager;->OIX0iXi:Lcom/android/mltcode/paycertificationapi/bo4;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/bo4;->XOO0ii0()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WAManager checkLoginStatus "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/wl6;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/wl6;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/biz/wa/WAManager;->X1IX(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final OO()V
    .locals 6

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    new-instance v1, Lcom/sma/smartv3/biz/wa/WAManager$XIi00iiXO;

    invoke-direct {v1, v0}, Lcom/sma/smartv3/biz/wa/WAManager$XIi00iiXO;-><init>(Ljava/util/Timer;)V

    const-wide/16 v2, 0x1f4

    const-wide/16 v4, 0x1f4

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    return-void
.end method

.method public final X00Xi1X([B)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/sma/smartv3/biz/wa/WAManager;->O10IXXX0X:Ljava/io/PipedOutputStream;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    return-void
.end method

.method public final X1(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "toUserName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->II1Xi0()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "{\"phone\": \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\",\"isGroup\": false,\"isNewsletter\": false,\"isLid\": false,\"message\": \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\"}"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "WAManager sendTextMessage -> "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->iXiX011()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object p2, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p2}, Lcom/sma/smartv3/network/NetWorkUtils;->getHeadersMap()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addHeaders(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    const-string p2, "application/json"

    invoke-virtual {p1, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setContentType(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Bearer "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "Authorization"

    invoke-virtual {p1, v0, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addHeaders(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object p2, Lkotlin/text/Charsets;->XIi00iiXO:Ljava/nio/charset/Charset;

    invoke-virtual {v1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    const-string v0, "getBytes(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addByteBody([B)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->iXiX011()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object p2, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    const-class p2, Lcom/sma/smartv3/biz/wa/data/WAResponse;

    invoke-static {p2}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p2

    new-instance v0, Lcom/sma/smartv3/biz/wa/WAManager$sendTextMessage$1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/wa/WAManager$sendTextMessage$1;-><init>()V

    invoke-virtual {p1, p2, v0}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public final X100O()Z
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/wa/WAManager;->OIX0iXi:Lcom/android/mltcode/paycertificationapi/bo4;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/bo4;->XOO0ii0()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final X11I()V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "WAManager initWsManager"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/wa/WAManager;->OIX0iXi:Lcom/android/mltcode/paycertificationapi/bo4;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/bo4;->IiI10X()V

    :cond_0
    sput-object v1, Lcom/sma/smartv3/biz/wa/WAManager;->OIX0iXi:Lcom/android/mltcode/paycertificationapi/bo4;

    :cond_1
    new-instance v0, Lcom/android/mltcode/paycertificationapi/bo4$OXO1;

    sget-object v2, Lcom/sma/smartv3/biz/wa/WAManager;->XO0O10:Landroid/app/Application;

    if-nez v2, :cond_2

    const-string v2, "mApp"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v1, v2

    :goto_0
    invoke-direct {v0, v1}, Lcom/android/mltcode/paycertificationapi/bo4$OXO1;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->iXiiiO()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/bo4$OXO1;->I0IIOi(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/bo4$OXO1;

    move-result-object v0

    new-instance v1, Lio/socket/client/OXO1$OXO1;

    invoke-direct {v1}, Lio/socket/client/OXO1$OXO1;-><init>()V

    const-string v2, "/whatsapp/socket.io"

    iput-object v2, v1, Lio/socket/engineio/client/Transport$XO0O10;->XIi00iiXO:Ljava/lang/String;

    const-wide/16 v2, 0x2710

    iput-wide v2, v1, Lio/socket/client/Manager$I0iXXO;->XX0:J

    const-wide/16 v2, 0x4e20

    iput-wide v2, v1, Lio/socket/client/Manager$I0iXXO;->OiIIX101O:J

    const/4 v2, 0x1

    iput-boolean v2, v1, Lio/socket/client/Manager$I0iXXO;->XiOIO:Z

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/bo4$OXO1;->XOO0ii0(Lio/socket/client/OXO1$OXO1;)Lcom/android/mltcode/paycertificationapi/bo4$OXO1;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/biz/wa/WAManager;->XiOIO:Lcom/sma/smartv3/biz/wa/WAManager$OXO1;

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/bo4$OXO1;->IiI10X(Lcom/android/mltcode/paycertificationapi/bo4$XIi00iiXO;)Lcom/android/mltcode/paycertificationapi/bo4$OXO1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/bo4$OXO1;->O00()Lcom/android/mltcode/paycertificationapi/bo4;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/biz/wa/WAManager;->OIX0iXi:Lcom/android/mltcode/paycertificationapi/bo4;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/bo4;->O00()V

    :cond_3
    return-void
.end method

.method public final X11iII1O1()Ljava/io/File;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/wa/WAManager;->I0IIOi:Ljava/io/File;

    return-object v0
.end method

.method public final X1IX(Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->II1Xi0()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WAManager getProfile -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->iOO1ii1()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/androidnetworking/AndroidNetworking;->get(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Bearer "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Authorization"

    invoke-virtual {v1, v2, v0}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->addHeaders(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->iOO1ii1()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v0

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/biz/wa/data/WAProfile;

    invoke-static {v1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/biz/wa/WAManager$getProfile$1;

    invoke-direct {v2, p1}, Lcom/sma/smartv3/biz/wa/WAManager$getProfile$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public final XO0X10iO(Ljava/lang/String;)V
    .locals 13
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WAManager sendLoginQrcodeToDevice -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v3, Lcom/szabh/smable3/BleKey;->CHAT_APP:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v5, Lcom/szabh/smable3/entity/BleChatApp;

    const/16 v11, 0xc

    const/4 v12, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v10, p1

    invoke-direct/range {v5 .. v12}, Lcom/szabh/smable3/entity/BleChatApp;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v8, 0x18

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    return-void
.end method

.method public final XOIX()V
    .locals 2

    sget-boolean v0, Lcom/sma/smartv3/biz/wa/WAManager;->I0iXXO:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "WAManager -> startRealTime"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/biz/wa/WAManager$iO;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/wa/WAManager$iO;-><init>()V

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->executeByIo(Lcom/blankj/utilcode/util/ThreadUtils$Task;)V

    return-void
.end method

.method public final XOO0XOOii()V
    .locals 3

    sget-object v0, Lcom/sma/smartv3/biz/wa/WAManager;->iIiiO:Lkotlinx/coroutines/XiOIO;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/XiOIO$OXO1;->XIi00iiXO(Lkotlinx/coroutines/XiOIO;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    sput-object v1, Lcom/sma/smartv3/biz/wa/WAManager;->iIiiO:Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public final XOX0O0(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleAddress()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WA_AUTH_TOKEN_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final XOXiX0()V
    .locals 3

    sget-object v0, Lcom/sma/smartv3/biz/wa/WAManager;->XX0:Lkotlinx/coroutines/XiOIO;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/XiOIO$OXO1;->XIi00iiXO(Lkotlinx/coroutines/XiOIO;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    sput-object v1, Lcom/sma/smartv3/biz/wa/WAManager;->XX0:Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public final XX1Oi(Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->II1Xi0()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WAManager logout -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->O1O()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Bearer "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Authorization"

    invoke-virtual {v1, v2, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addHeaders(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {v1}, Lcom/sma/smartv3/network/NetWorkUtils;->getHeadersMap()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addHeaders(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->O1O()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/biz/wa/data/WAResponse;

    invoke-static {v1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/biz/wa/WAManager$logout$1;

    invoke-direct {v2, p1}, Lcom/sma/smartv3/biz/wa/WAManager$logout$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    sget-object p1, Lcom/sma/smartv3/biz/wa/WAManager;->OIX0iXi:Lcom/android/mltcode/paycertificationapi/bo4;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/bo4;->IiI10X()V

    :cond_0
    return-void
.end method

.method public final XXIIO1i11()Ljava/lang/String;
    .locals 4

    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    const-string v1, ""

    iput-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    new-instance v1, Lcom/sma/smartv3/biz/wa/WAManager$getLoginQrCodeBlock$1;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/sma/smartv3/biz/wa/WAManager$getLoginQrCodeBlock$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

    const/4 v3, 0x1

    invoke-static {v2, v1, v3, v2}, Lcom/android/mltcode/paycertificationapi/I100X1;->XOO0ii0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final XXO()Ljava/lang/String;
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleAddress()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WA_SESSION_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final XXX11i()Ljava/io/File;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/wa/WAManager;->XOO0ii0:Ljava/io/File;

    return-object v0
.end method

.method public final XXiIiX10(Ljava/lang/String;)V
    .locals 10

    new-instance v0, Lcom/szabh/smable3/entity/BleVoice;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v7, p1

    invoke-direct/range {v0 .. v9}, Lcom/szabh/smable3/entity/BleVoice;-><init>(IIILcom/szabh/smable3/entity/BleVoice$BleDeviceEmotion;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->AUDIO_TEXT:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, v0

    move-object v0, p1

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    return-void
.end method

.method public final i010I()Ljava/lang/String;
    .locals 1

    const-string v0, "ai.iot-solution.net"

    return-object v0
.end method

.method public final i0X000X0O()V
    .locals 13

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "WAManager sendLoggingToDevice"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v3, Lcom/szabh/smable3/BleKey;->CHAT_APP:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v5, Lcom/szabh/smable3/entity/BleChatApp;

    const/16 v11, 0x1c

    const/4 v12, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v5 .. v12}, Lcom/szabh/smable3/entity/BleChatApp;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v8, 0x18

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    return-void
.end method

.method public final i11I()V
    .locals 13

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "WAManager sendLoginFailedToDevice"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v3, Lcom/szabh/smable3/BleKey;->CHAT_APP:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v5, Lcom/szabh/smable3/entity/BleChatApp;

    const/16 v11, 0x1c

    const/4 v12, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v5 .. v12}, Lcom/szabh/smable3/entity/BleChatApp;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v8, 0x18

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    return-void
.end method

.method public final iI()Ljava/io/File;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/wa/WAManager;->O00:Ljava/io/File;

    return-object v0
.end method

.method public final iIXi1iiXI()Lcom/sma/smartv3/biz/wa/data/WAUserInfo;
    .locals 4
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    const-class v2, Lcom/sma/smartv3/biz/wa/data/WAUserInfo;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/biz/wa/data/WAUserInfo;

    return-object v0
.end method

.method public final iOO1ii1()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->i010I()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->XXO()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "https://"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/whatsapp/api/"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/host-device"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final iOOX010X(Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "WAManager getAuthToken"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->iX()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->iX()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {v1}, Lcom/sma/smartv3/network/NetWorkUtils;->getHeadersMap()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addHeaders(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/biz/wa/data/WAToken;

    invoke-static {v1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/biz/wa/WAManager$getAuthToken$1;

    invoke-direct {v2, p1}, Lcom/sma/smartv3/biz/wa/WAManager$getAuthToken$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public final iOiXi11II(Ljava/lang/String;)V
    .locals 15

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    new-instance v0, Lcom/szabh/smable3/entity/BleVoice;

    const/16 v8, 0xc

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v7, p1

    invoke-direct/range {v0 .. v9}, Lcom/szabh/smable3/entity/BleVoice;-><init>(IIILcom/szabh/smable3/entity/BleVoice$BleDeviceEmotion;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v7, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v8, Lcom/szabh/smable3/BleKey;->AUDIO_TEXT:Lcom/szabh/smable3/BleKey;

    sget-object v9, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v13, 0x18

    const/4 v14, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v10, v0

    invoke-static/range {v7 .. v14}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    return-void
.end method

.method public final iX()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->i010I()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->XXO()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "https://"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/whatsapp/api/"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/THISISMYSECURETOKEN/generate-token"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final iX1O1()Ljava/io/File;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/wa/WAManager;->IiI10X:Ljava/io/File;

    return-object v0
.end method

.method public final iXiX011()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->i010I()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->XXO()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "https://"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/whatsapp/api/"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/send-message"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final iXiiiO()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wa/WAManager;->i010I()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "wss://"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final iiIOiX()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    sget-object v2, Lcom/sma/smartv3/biz/wa/WAManager;->X1ii:Ljava/io/PipedInputStream;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/io/PipedInputStream;->close()V

    goto :goto_0

    :catchall_0
    move-exception v2

    goto :goto_2

    :catch_0
    move-exception v2

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v2, Lcom/sma/smartv3/biz/wa/WAManager;->O10IXXX0X:Ljava/io/PipedOutputStream;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/io/PipedOutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sput-object v1, Lcom/sma/smartv3/biz/wa/WAManager;->X1ii:Ljava/io/PipedInputStream;

    sput-object v1, Lcom/sma/smartv3/biz/wa/WAManager;->O10IXXX0X:Ljava/io/PipedOutputStream;

    sput-object v1, Lcom/sma/smartv3/biz/wa/WAManager;->XXI:Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    sput-boolean v0, Lcom/sma/smartv3/biz/wa/WAManager;->I0iXXO:Z

    return-void

    :goto_1
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sput-object v1, Lcom/sma/smartv3/biz/wa/WAManager;->X1ii:Ljava/io/PipedInputStream;

    sput-object v1, Lcom/sma/smartv3/biz/wa/WAManager;->O10IXXX0X:Ljava/io/PipedOutputStream;

    sput-object v1, Lcom/sma/smartv3/biz/wa/WAManager;->XXI:Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    sput-boolean v0, Lcom/sma/smartv3/biz/wa/WAManager;->I0iXXO:Z

    return-void

    :goto_2
    sput-object v1, Lcom/sma/smartv3/biz/wa/WAManager;->X1ii:Ljava/io/PipedInputStream;

    sput-object v1, Lcom/sma/smartv3/biz/wa/WAManager;->O10IXXX0X:Ljava/io/PipedOutputStream;

    sput-object v1, Lcom/sma/smartv3/biz/wa/WAManager;->XXI:Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    sput-boolean v0, Lcom/sma/smartv3/biz/wa/WAManager;->I0iXXO:Z

    throw v2
.end method

.method public final iiiO()V
    .locals 7

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "WAManager initWA"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->O00X()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/I0IIOi;->OXO1(Lkotlin/coroutines/CoroutineContext;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v1

    new-instance v4, Lcom/sma/smartv3/biz/wa/WAManager$initWA$1;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lcom/sma/smartv3/biz/wa/WAManager$initWA$1;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    :cond_0
    return-void
.end method
