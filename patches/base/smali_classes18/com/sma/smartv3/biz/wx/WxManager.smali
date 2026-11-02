.class public final Lcom/sma/smartv3/biz/wx/WxManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWxManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WxManager.kt\ncom/sma/smartv3/biz/wx/WxManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,1388:1\n90#2:1389\n15#2:1390\n*S KotlinDebug\n*F\n+ 1 WxManager.kt\ncom/sma/smartv3/biz/wx/WxManager\n*L\n636#1:1389\n973#1:1390\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWxManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WxManager.kt\ncom/sma/smartv3/biz/wx/WxManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,1388:1\n90#2:1389\n15#2:1390\n*S KotlinDebug\n*F\n+ 1 WxManager.kt\ncom/sma/smartv3/biz/wx/WxManager\n*L\n636#1:1389\n973#1:1390\n*E\n"
    }
.end annotation


# static fields
.field public static I0IIOi:Z = false

.field public static I0iXXO:Lcom/baidu/ai/speech/realtime/full/connection/Runner; = null
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public static I1XOi1:Z = false

.field public static final IIX1OXO:Lcom/sma/smartv3/biz/wx/WxManager$mBleHandleCallback$1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static IO:Lcom/android/mltcode/paycertificationapi/n77; = null
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

.field public static O10IXXX0X:Lcom/sma/smartv3/biz/voice/OpusManager; = null
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public static volatile OIX0iXi:Z = false

.field public static OIi0:Lcom/android/mltcode/paycertificationapi/ki1; = null
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public static final OXO1:Lcom/sma/smartv3/biz/wx/WxManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static OiIIX101O:Lkotlinx/coroutines/XiOIO; = null
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public static X0O:Ljava/lang/String; = null
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static X1ii:Ljava/io/PipedOutputStream; = null
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public static final XIi00iiXO:Ljava/lang/String; = "WxManager"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static XO0O10:Landroid/app/Application;

.field public static final XOO0ii0:Ljava/io/File;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static XX0:Lkotlinx/coroutines/XiOIO;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public static XXI:Ljava/io/PipedInputStream;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public static XiOIO:Lcom/sma/smartv3/biz/wx/WxManager$mWsStatusListener$1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static XiOIii1:I

.field public static iIiiO:Lkotlinx/coroutines/XiOIO;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public static final iO:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/biz/wx/WxManager;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/wx/WxManager;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->OXO1:Lcom/sma/smartv3/biz/wx/WxManager;

    const-string v0, "\u8be5\u8d26\u53f7\u9700\u8981\u91cd\u65b0\u767b\u5f55\uff01loginState == MMLoginStateNoLogin "

    sput-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->iO:Ljava/lang/String;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    const-string v1, "wx_opus.ogg"

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/uz0;->iO(Lcom/android/mltcode/paycertificationapi/sz0;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    sput-object v1, Lcom/sma/smartv3/biz/wx/WxManager;->O00:Ljava/io/File;

    const-string v1, "wx_opus.pcm"

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/uz0;->iO(Lcom/android/mltcode/paycertificationapi/sz0;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    sput-object v1, Lcom/sma/smartv3/biz/wx/WxManager;->IiI10X:Ljava/io/File;

    const-string v1, "wx_opus.wav"

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/uz0;->iO(Lcom/android/mltcode/paycertificationapi/sz0;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->XOO0ii0:Ljava/io/File;

    const-string v0, "mac"

    sput-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->X0O:Ljava/lang/String;

    const/4 v0, 0x1

    sput-boolean v0, Lcom/sma/smartv3/biz/wx/WxManager;->I1XOi1:Z

    new-instance v0, Lcom/sma/smartv3/biz/wx/WxManager$mBleHandleCallback$1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/wx/WxManager$mBleHandleCallback$1;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->IIX1OXO:Lcom/sma/smartv3/biz/wx/WxManager$mBleHandleCallback$1;

    new-instance v0, Lcom/sma/smartv3/biz/wx/WxManager$mWsStatusListener$1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/wx/WxManager$mWsStatusListener$1;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->XiOIO:Lcom/sma/smartv3/biz/wx/WxManager$mWsStatusListener$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final I0(JJ)V
    .locals 0

    return-void
.end method

.method public static final synthetic I0IIOi(Lcom/sma/smartv3/biz/wx/WxManager;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->iXiiiO()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic I0iXXO()Ljava/io/PipedInputStream;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->XXI:Ljava/io/PipedInputStream;

    return-object v0
.end method

.method public static final synthetic I1(Lcom/android/mltcode/paycertificationapi/ki1;)V
    .locals 0

    sput-object p0, Lcom/sma/smartv3/biz/wx/WxManager;->OIi0:Lcom/android/mltcode/paycertificationapi/ki1;

    return-void
.end method

.method public static final synthetic I1XOi1()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/biz/wx/WxManager;->I1XOi1:Z

    return v0
.end method

.method public static final synthetic II1Xi0(Z)V
    .locals 0

    sput-boolean p0, Lcom/sma/smartv3/biz/wx/WxManager;->OIX0iXi:Z

    return-void
.end method

.method public static final synthetic IIX1OXO()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/biz/wx/WxManager;->OIX0iXi:Z

    return v0
.end method

.method public static final synthetic IO(Lcom/sma/smartv3/biz/wx/WxManager;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->OX110i()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IX1XiI(Lcom/sma/smartv3/biz/wx/WxManager;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/wx/WxManager;->iOI(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic IXOIIIO(Lcom/sma/smartv3/biz/wx/WxManager;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/wx/WxManager;->X1(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic IXXOO(Lcom/sma/smartv3/biz/wx/WxManager;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->I0XXi0X()Z

    move-result p0

    return p0
.end method

.method public static synthetic IiI10X(Lkotlin/jvm/functions/Function1;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/wx/WxManager;->iI(Lkotlin/jvm/functions/Function1;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->XXX11i(Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O001I(Lcom/sma/smartv3/biz/wx/WxManager;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/wx/WxManager;->iXiX011(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic O0O(Lcom/sma/smartv3/biz/wx/WxManager;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/wx/WxManager;->iXi(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final O1(JJ)V
    .locals 0

    return-void
.end method

.method public static final synthetic O10IXXX0X()Lcom/sma/smartv3/biz/voice/OpusManager;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->O10IXXX0X:Lcom/sma/smartv3/biz/voice/OpusManager;

    return-object v0
.end method

.method public static final synthetic OII(Ljava/io/PipedInputStream;)V
    .locals 0

    sput-object p0, Lcom/sma/smartv3/biz/wx/WxManager;->XXI:Ljava/io/PipedInputStream;

    return-void
.end method

.method public static final synthetic OIX0iXi()Lcom/baidu/ai/speech/realtime/full/connection/Runner;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->I0iXXO:Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    return-object v0
.end method

.method public static final synthetic OIi0()Lkotlinx/coroutines/XiOIO;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->iIiiO:Lkotlinx/coroutines/XiOIO;

    return-object v0
.end method

.method public static final synthetic OX(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lcom/sma/smartv3/biz/wx/WxManager;->X0O:Ljava/lang/String;

    return-void
.end method

.method public static synthetic OXO1(Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->X0i1O(Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic OiIIX101O(Z)V
    .locals 0

    sput-boolean p0, Lcom/sma/smartv3/biz/wx/WxManager;->I1XOi1:Z

    return-void
.end method

.method public static synthetic X00XIX1(Lcom/sma/smartv3/biz/wx/WxManager;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/wx/WxManager;->iOiXi11II(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic X01IiOiIi(Lcom/android/mltcode/paycertificationapi/n77;)V
    .locals 0

    sput-object p0, Lcom/sma/smartv3/biz/wx/WxManager;->IO:Lcom/android/mltcode/paycertificationapi/n77;

    return-void
.end method

.method public static final synthetic X0O()Lcom/android/mltcode/paycertificationapi/n77;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->IO:Lcom/android/mltcode/paycertificationapi/n77;

    return-object v0
.end method

.method public static final X0i1O(Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->OXO1:Lcom/sma/smartv3/biz/wx/WxManager;

    invoke-virtual {v0, p0}, Lcom/sma/smartv3/biz/wx/WxManager;->X111IO(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/wx/WxManager;->O101()V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static final X1IX(Z)Lkotlin/Unit;
    .locals 1

    if-eqz p0, :cond_0

    sget-object p0, Lcom/sma/smartv3/biz/wx/WxManager;->OXO1:Lcom/sma/smartv3/biz/wx/WxManager;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/w77;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/w77;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/biz/wx/WxManager;->iOiXi11II(Lkotlin/jvm/functions/Function1;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic X1ii()Lcom/android/mltcode/paycertificationapi/ki1;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->OIi0:Lcom/android/mltcode/paycertificationapi/ki1;

    return-object v0
.end method

.method public static synthetic XIi00iiXO(JJ)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/wx/WxManager;->O1(JJ)V

    return-void
.end method

.method public static synthetic XO0O10(Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->X1IX(Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic XOO0ii0(Lcom/sma/smartv3/biz/wx/WxManager;)Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->iOO1ii1()Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XOXiX0(Lcom/sma/smartv3/biz/wx/WxManager;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/wx/WxManager;->XOIX(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic XX0(Lcom/sma/smartv3/biz/wx/WxManager;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/wx/WxManager;->i100IXOX(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic XXI()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->X0O:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic XXIIO1i11(Lcom/sma/smartv3/biz/wx/WxManager;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/wx/WxManager;->O1O(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final XXX11i(Z)Lkotlin/Unit;
    .locals 1

    if-eqz p0, :cond_1

    sget-object p0, Lcom/sma/smartv3/biz/wx/WxManager;->IO:Lcom/android/mltcode/paycertificationapi/n77;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/n77;->OXO1()Z

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/sma/smartv3/biz/wx/WxManager;->OXO1:Lcom/sma/smartv3/biz/wx/WxManager;

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->IO0iXO0O()V

    :goto_0
    sget-object p0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "WxManager checkLoginStatus \u5df2\u767b"

    invoke-virtual {p0, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p0, Lcom/sma/smartv3/biz/wx/WxManager;->OXO1:Lcom/sma/smartv3/biz/wx/WxManager;

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->iIi1()V

    goto :goto_1

    :cond_1
    sget-object p0, Lcom/sma/smartv3/biz/wx/WxManager;->OXO1:Lcom/sma/smartv3/biz/wx/WxManager;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/t77;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/t77;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/biz/wx/WxManager;->iXiX011(Lkotlin/jvm/functions/Function1;)V

    :goto_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic XiOIO(Lcom/sma/smartv3/biz/wx/WxManager;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->XXiO0i()V

    return-void
.end method

.method public static final synthetic XiOIii1(Lcom/baidu/ai/speech/realtime/full/connection/Runner;)V
    .locals 0

    sput-object p0, Lcom/sma/smartv3/biz/wx/WxManager;->I0iXXO:Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    return-void
.end method

.method public static final synthetic i010I(Z)V
    .locals 0

    sput-boolean p0, Lcom/sma/smartv3/biz/wx/WxManager;->I0IIOi:Z

    return-void
.end method

.method public static final iI(Lkotlin/jvm/functions/Function1;Z)Lkotlin/Unit;
    .locals 1

    if-eqz p1, :cond_1

    sget-object p1, Lcom/sma/smartv3/biz/wx/WxManager;->IO:Lcom/android/mltcode/paycertificationapi/n77;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/n77;->OXO1()Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/sma/smartv3/biz/wx/WxManager;->OXO1:Lcom/sma/smartv3/biz/wx/WxManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wx/WxManager;->IO0iXO0O()V

    :goto_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "WxManager checkLoginStatus \u5df2\u767b"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/biz/wx/WxManager;->OXO1:Lcom/sma/smartv3/biz/wx/WxManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wx/WxManager;->iIi1()V

    if-eqz p0, :cond_3

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "WxManager checkLoginStatus \u672a\u767b\u5f55"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/biz/wx/WxManager;->IO:Lcom/android/mltcode/paycertificationapi/n77;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/n77;->XOO0ii0()V

    :cond_2
    sget-object p1, Lcom/sma/smartv3/biz/wx/WxManager;->OXO1:Lcom/sma/smartv3/biz/wx/WxManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wx/WxManager;->X00O0()V

    if-eqz p0, :cond_3

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic iIiiO(Lcom/sma/smartv3/biz/wx/WxManager;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/wx/WxManager;->Xi1i0XOX0(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic iO(JJ)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/wx/WxManager;->I0(JJ)V

    return-void
.end method

.method public static final synthetic iOOX010X(Ljava/io/PipedOutputStream;)V
    .locals 0

    sput-object p0, Lcom/sma/smartv3/biz/wx/WxManager;->X1ii:Ljava/io/PipedOutputStream;

    return-void
.end method

.method public static final synthetic iX(Lcom/sma/smartv3/biz/wx/WxManager;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->XXOXi()V

    return-void
.end method

.method public static synthetic iii0(Lcom/sma/smartv3/biz/wx/WxManager;Ljava/lang/String;ILjava/lang/Object;)V
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
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/wx/WxManager;->Xi1i0XOX0(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final I0XXi0X()Z
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->iIXi1iiXI()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WxManager syncCheckLoginStatus -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v1, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    new-instance v2, Lcom/sma/smartv3/biz/wx/WxManager$syncCheckLoginStatus$1;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lcom/sma/smartv3/biz/wx/WxManager$syncCheckLoginStatus$1;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/coroutines/Continuation;)V

    const/4 v0, 0x1

    invoke-static {v3, v2, v0, v3}, Lcom/android/mltcode/paycertificationapi/I100X1;->XOO0ii0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, v1, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    return v0
.end method

.method public final IO0II0i()Lcom/sma/smartv3/biz/wx/data/WxProfile;
    .locals 4
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    const-class v2, Lcom/sma/smartv3/biz/wx/data/WxProfile;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/biz/wx/data/WxProfile;

    return-object v0
.end method

.method public final IO0iXO0O()V
    .locals 5

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->iIXi1iiXI()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WxManager initWsManager "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v1, Lcom/sma/smartv3/biz/wx/WxManager;->IO:Lcom/android/mltcode/paycertificationapi/n77;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/n77;->XOO0ii0()V

    :cond_0
    sput-object v2, Lcom/sma/smartv3/biz/wx/WxManager;->IO:Lcom/android/mltcode/paycertificationapi/n77;

    :cond_1
    new-instance v1, Lcom/android/mltcode/paycertificationapi/n77$O00;

    sget-object v3, Lcom/sma/smartv3/biz/wx/WxManager;->XO0O10:Landroid/app/Application;

    if-nez v3, :cond_2

    const-string v3, "mApp"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v2, v3

    :goto_0
    invoke-direct {v1, v2}, Lcom/android/mltcode/paycertificationapi/n77$O00;-><init>(Landroid/content/Context;)V

    new-instance v2, Lokhttp3/OkHttpClient;

    invoke-direct {v2}, Lokhttp3/OkHttpClient;-><init>()V

    invoke-virtual {v2}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    move-result-object v2

    new-instance v3, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;

    sget-object v4, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    invoke-direct {v3, v4}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;-><init>(Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;)V

    sget-object v4, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;->BODY:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    invoke-virtual {v3, v4}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->O00(Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;)Lcom/sma/androidnetworklib/HttpLoggingInterceptor;

    sget-object v4, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {v2, v3}, Lokhttp3/OkHttpClient$Builder;->addInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v2

    invoke-virtual {v2}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/n77$O00;->OIi0(Lokhttp3/OkHttpClient;)Lcom/android/mltcode/paycertificationapi/n77$O00;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/n77$O00;->XXI(Z)Lcom/android/mltcode/paycertificationapi/n77$O00;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->IiiXiI0I()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "?key="

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/n77$O00;->X1ii(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/n77$O00;

    move-result-object v0

    invoke-static {}, Lkotlin/collections/OXO1;->I1()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/n77$O00;->I0iXXO(Ljava/util/Map;)Lcom/android/mltcode/paycertificationapi/n77$O00;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/n77$O00;->I0IIOi()Lcom/android/mltcode/paycertificationapi/n77;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->IO:Lcom/android/mltcode/paycertificationapi/n77;

    if-eqz v0, :cond_3

    sget-object v1, Lcom/sma/smartv3/biz/wx/WxManager;->XiOIO:Lcom/sma/smartv3/biz/wx/WxManager$mWsStatusListener$1;

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/n77;->II1Xi0(Lcom/android/mltcode/paycertificationapi/q77;)V

    :cond_3
    sget-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->IO:Lcom/android/mltcode/paycertificationapi/n77;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/n77;->iO()V

    :cond_4
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->iX1O1()V

    return-void
.end method

.method public final IOi1O0()V
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->iIXi1iiXI()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->iiIOiX()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/androidnetworking/AndroidNetworking;->upload(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object v1

    const-string v2, "key"

    invoke-virtual {v1, v2, v0}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->addMultipartParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->iiIOiX()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object v0

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/r77;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/r77;-><init>()V

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest;->setUploadProgressListener(Lcom/androidnetworking/interfaces/UploadProgressListener;)Lcom/androidnetworking/common/ANRequest;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/reflect/Type;

    const-class v2, Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Lcom/sma/smartv3/biz/wx/data/WxResponse;

    invoke-static {v2, v1}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/biz/wx/WxManager$wakeUpLogin$2;

    invoke-direct {v2}, Lcom/sma/smartv3/biz/wx/WxManager$wakeUpLogin$2;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public final IX0IXOi(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "authKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleAddress()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WX_AUTH_KEY_"

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

.method public final IXI()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->XXO()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "https://"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/api/message/SendVoice"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final IXiOXO()V
    .locals 7

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->XIIO11I()V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/I0IIOi;->OXO1(Lkotlin/coroutines/CoroutineContext;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v1

    new-instance v4, Lcom/sma/smartv3/biz/wx/WxManager$startPollingCheckLoginStatus$1;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lcom/sma/smartv3/biz/wx/WxManager$startPollingCheckLoginStatus$1;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->XX0:Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public final Ii0X0X()Ljava/io/File;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->XOO0ii0:Ljava/io/File;

    return-object v0
.end method

.method public final Ii0i()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->XXO()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "https://"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/wechat/message/SendTextMessage"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final Ii1iii0()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->iO:Ljava/lang/String;

    return-object v0
.end method

.method public final IiiXiI0I()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->XXO()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "wss://"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/wechat/ws/GetSyncMsg"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final O0O0X0iOi()Z
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->IO:Lcom/android/mltcode/paycertificationapi/n77;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/n77;->OXO1()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final O101()V
    .locals 7

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->XXI0XOIX()V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/I0IIOi;->OXO1(Lkotlin/coroutines/CoroutineContext;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v1

    new-instance v4, Lcom/sma/smartv3/biz/wx/WxManager$startPollingCheckLoginQrcodeStatus$1;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lcom/sma/smartv3/biz/wx/WxManager$startPollingCheckLoginQrcodeStatus$1;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->OiIIX101O:Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public final O1O(Lkotlin/jvm/functions/Function1;)V
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

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v1, Lcom/sma/smartv3/biz/wx/WxManager;->IO:Lcom/android/mltcode/paycertificationapi/n77;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/n77;->OXO1()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WxManager checkLoginStatus "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/v77;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/v77;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/biz/wx/WxManager;->X1(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final OO()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->XXO()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "https://"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/wechat/sns/GetSnsSync"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final OX110i()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->XXO()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "https://"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/wechat/user/GetProfile"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final Oi(Landroid/app/Application;)V
    .locals 2
    .param p1    # Landroid/app/Application;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "app"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "WxManager -> init"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sput-object p1, Lcom/sma/smartv3/biz/wx/WxManager;->XO0O10:Landroid/app/Application;

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->IIX1OXO:Lcom/sma/smartv3/biz/wx/WxManager$mBleHandleCallback$1;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object p1, Lcom/sma/smartv3/biz/wx/WxManager;->O10IXXX0X:Lcom/sma/smartv3/biz/voice/OpusManager;

    if-nez p1, :cond_0

    :try_start_0
    new-instance p1, Lcom/sma/smartv3/biz/voice/OpusManager;

    invoke-direct {p1}, Lcom/sma/smartv3/biz/voice/OpusManager;-><init>()V

    sput-object p1, Lcom/sma/smartv3/biz/wx/WxManager;->O10IXXX0X:Lcom/sma/smartv3/biz/voice/OpusManager;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "WxManager -> opus init error\uff01\uff01\uff01"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final X00O0()V
    .locals 13

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "WxManager sendLoginFailedToDevice"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v3, Lcom/szabh/smable3/BleKey;->CHAT_APP:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v5, Lcom/szabh/smable3/entity/BleChatApp;

    const/16 v11, 0x1c

    const/4 v12, 0x0

    const/16 v6, 0xf

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

.method public final X00Xi1X(Lcom/sma/smartv3/biz/wx/data/Message;)Ljava/lang/String;
    .locals 8
    .param p1    # Lcom/sma/smartv3/biz/wx/data/Message;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wx/data/Message;->getPush_content()Ljava/lang/String;

    move-result-object v1

    const/4 v0, 0x2

    const/4 v2, 0x0

    const-string v3, " : "

    const/4 v7, 0x0

    invoke-static {v1, v3, v7, v0, v2}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt__StringsKt;->i1I(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wx/data/Message;->getContent()Lcom/sma/smartv3/biz/wx/data/WxString;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/wx/data/WxString;->getStr()Ljava/lang/String;

    move-result-object v0

    :cond_1
    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wx/data/Message;->getMsg_type()I

    move-result p1

    const/4 v1, 0x3

    if-eq p1, v1, :cond_7

    const/16 v1, 0x22

    if-eq p1, v1, :cond_6

    const/16 v1, 0x2a

    if-eq p1, v1, :cond_5

    const/16 v1, 0x2b

    if-eq p1, v1, :cond_4

    const/16 v1, 0x30

    if-eq p1, v1, :cond_3

    const/16 v1, 0x31

    if-eq p1, v1, :cond_2

    goto :goto_1

    :cond_2
    const p1, 0x7f1402aa

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    goto :goto_1

    :cond_3
    const p1, 0x7f1402a6

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    goto :goto_1

    :cond_4
    const p1, 0x7f1402ac

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    goto :goto_1

    :cond_5
    const p1, 0x7f1402ab

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    goto :goto_1

    :cond_6
    const p1, 0x7f1402ad

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    goto :goto_1

    :cond_7
    const p1, 0x7f1402a5

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    const/16 v1, 0x64

    if-le p1, v1, :cond_8

    invoke-virtual {v0, v7, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string v0, "substring(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_8
    return-object v0
.end method

.method public final X0iO()V
    .locals 5

    const/4 v0, 0x0

    sput-boolean v0, Lcom/sma/smartv3/biz/wx/WxManager;->I1XOi1:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->iIXi1iiXI()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "WxManager sendLoggingVerificationUrl -> "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->X100O()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    const-string v3, "key"

    invoke-virtual {v2, v3, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->X100O()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    sget-object v2, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v1, v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/reflect/Type;

    const-class v3, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCode;

    aput-object v3, v2, v0

    const-class v0, Lcom/sma/smartv3/biz/wx/data/WxResponse;

    invoke-static {v0, v2}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    new-instance v2, Lcom/sma/smartv3/biz/wx/WxManager$sendLoggingVerificationUrl$1;

    invoke-direct {v2}, Lcom/sma/smartv3/biz/wx/WxManager$sendLoggingVerificationUrl$1;-><init>()V

    invoke-virtual {v1, v0, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public final X1(Lkotlin/jvm/functions/Function1;)V
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

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->iIXi1iiXI()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WxManager getProfile -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->OX110i()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/androidnetworking/AndroidNetworking;->get(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v1

    const-string v2, "key"

    invoke-virtual {v1, v2, v0}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->OX110i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v0

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/reflect/Type;

    const-class v2, Lcom/sma/smartv3/biz/wx/data/WxProfile;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Lcom/sma/smartv3/biz/wx/data/WxResponse;

    invoke-static {v2, v1}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/biz/wx/WxManager$getProfile$1;

    invoke-direct {v2, p1}, Lcom/sma/smartv3/biz/wx/WxManager$getProfile$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public final X100O()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->XXO()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "https://"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/api/wechat/login/VerifyCodeSlideV2"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final X111IO(Ljava/lang/String;)V
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

    const-string v2, "WxManager sendLoginQrcodeToDevice -> "

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

    const/16 v6, 0xf

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

.method public final X11I()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->XXO()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "https://"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/api/login/GetLoginQrCodeNew"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final X11iII1O1()V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/s77;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/s77;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/biz/wx/WxManager;->X1(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final X1OI(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
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

    const-string v2, "WxManager sendTextMessageToDevice -> "

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

    const/16 v1, 0xf

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

.method public final XIIO11I()V
    .locals 3

    sget-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->XX0:Lkotlinx/coroutines/XiOIO;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/XiOIO$OXO1;->XIi00iiXO(Lkotlinx/coroutines/XiOIO;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    sput-object v1, Lcom/sma/smartv3/biz/wx/WxManager;->XX0:Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public final XO0X10iO()Ljava/io/File;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->IiI10X:Ljava/io/File;

    return-object v0
.end method

.method public final XOIX(Lkotlin/jvm/functions/Function1;)V
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

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->iIXi1iiXI()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WxManager getSnsSync -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->OO()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    const-string v2, "key"

    invoke-virtual {v1, v2, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->OO()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/reflect/Type;

    const-class v2, Lcom/sma/smartv3/biz/wx/data/WxSnsSync;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Lcom/sma/smartv3/biz/wx/data/WxResponse;

    invoke-static {v2, v1}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/biz/wx/WxManager$getSnsSync$1;

    invoke-direct {v2, p1}, Lcom/sma/smartv3/biz/wx/WxManager$getSnsSync$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public final XOO0XOOii()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->XXO()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "https://"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/api/login/VerifyCode"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final XOX0O0()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->XXO()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "https://"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/wechat/login/LogOut"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final XX00i10X()V
    .locals 7

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "WxManager initWx"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->ii1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/I0IIOi;->OXO1(Lkotlin/coroutines/CoroutineContext;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v1

    new-instance v4, Lcom/sma/smartv3/biz/wx/WxManager$initWx$1;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lcom/sma/smartv3/biz/wx/WxManager$initWx$1;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    :cond_0
    return-void
.end method

.method public final XX1Oi()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->XXO()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "https://"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/wechat/user/GetMyQrCode"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final XXI0XOIX()V
    .locals 3

    sget-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->OiIIX101O:Lkotlinx/coroutines/XiOIO;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/XiOIO$OXO1;->XIi00iiXO(Lkotlinx/coroutines/XiOIO;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    sput-object v1, Lcom/sma/smartv3/biz/wx/WxManager;->OiIIX101O:Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public final XXO()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->X00XIX1()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->OiO()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "ai-dev.iot-solution.net"

    return-object v0

    :cond_1
    :goto_0
    const-string v0, "dev.iot-solution.net"

    return-object v0
.end method

.method public final XXOXi()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "WxManager -> stopRealTime"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    sget-object v2, Lcom/sma/smartv3/biz/wx/WxManager;->XXI:Ljava/io/PipedInputStream;

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
    sget-object v2, Lcom/sma/smartv3/biz/wx/WxManager;->X1ii:Ljava/io/PipedOutputStream;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/io/PipedOutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sput-object v1, Lcom/sma/smartv3/biz/wx/WxManager;->XXI:Ljava/io/PipedInputStream;

    sput-object v1, Lcom/sma/smartv3/biz/wx/WxManager;->X1ii:Ljava/io/PipedOutputStream;

    sput-object v1, Lcom/sma/smartv3/biz/wx/WxManager;->I0iXXO:Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    sput-boolean v0, Lcom/sma/smartv3/biz/wx/WxManager;->OIX0iXi:Z

    return-void

    :goto_1
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sput-object v1, Lcom/sma/smartv3/biz/wx/WxManager;->XXI:Ljava/io/PipedInputStream;

    sput-object v1, Lcom/sma/smartv3/biz/wx/WxManager;->X1ii:Ljava/io/PipedOutputStream;

    sput-object v1, Lcom/sma/smartv3/biz/wx/WxManager;->I0iXXO:Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    sput-boolean v0, Lcom/sma/smartv3/biz/wx/WxManager;->OIX0iXi:Z

    return-void

    :goto_2
    sput-object v1, Lcom/sma/smartv3/biz/wx/WxManager;->XXI:Ljava/io/PipedInputStream;

    sput-object v1, Lcom/sma/smartv3/biz/wx/WxManager;->X1ii:Ljava/io/PipedOutputStream;

    sput-object v1, Lcom/sma/smartv3/biz/wx/WxManager;->I0iXXO:Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    sput-boolean v0, Lcom/sma/smartv3/biz/wx/WxManager;->OIX0iXi:Z

    throw v2
.end method

.method public final declared-synchronized XXiIiX10()I
    .locals 1

    monitor-enter p0

    :try_start_0
    sget v0, Lcom/sma/smartv3/biz/wx/WxManager;->XiOIii1:I

    add-int/lit8 v0, v0, 0x1

    rem-int/lit16 v0, v0, 0x2710

    sput v0, Lcom/sma/smartv3/biz/wx/WxManager;->XiOIii1:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final XXiO0i()V
    .locals 6

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    new-instance v1, Lcom/sma/smartv3/biz/wx/WxManager$OXO1;

    invoke-direct {v1, v0}, Lcom/sma/smartv3/biz/wx/WxManager$OXO1;-><init>(Ljava/util/Timer;)V

    const-wide/16 v2, 0x1f4

    const-wide/16 v4, 0x1f4

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    return-void
.end method

.method public final Xi1i0XOX0(Ljava/lang/String;)V
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

.method public final Xii()V
    .locals 13

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "WxManager sendVerificationToDevice"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v3, Lcom/szabh/smable3/BleKey;->CHAT_APP:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v5, Lcom/szabh/smable3/entity/BleChatApp;

    const/16 v11, 0x1c

    const/4 v12, 0x0

    const/16 v6, 0xf

    const/16 v7, 0x8

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

.method public final Xii11I()V
    .locals 13

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "WxManager sendLoggingToDevice"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v3, Lcom/szabh/smable3/BleKey;->CHAT_APP:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v5, Lcom/szabh/smable3/entity/BleChatApp;

    const/16 v11, 0x1c

    const/4 v12, 0x0

    const/16 v6, 0xf

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

.method public final i0X000X0O()I
    .locals 1

    sget v0, Lcom/sma/smartv3/biz/wx/WxManager;->XiOIii1:I

    return v0
.end method

.method public final i100IXOX(Ljava/lang/String;)V
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

.method public final i11I()Ljava/io/File;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->O00:Ljava/io/File;

    return-object v0
.end method

.method public final iI0I([B)V
    .locals 1

    :try_start_0
    sget-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->X1ii:Ljava/io/PipedOutputStream;

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

.method public final iIX0i(Ljava/lang/String;Ljava/lang/String;)V
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

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->iIXi1iiXI()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "{  \"MsgItem\": [    {      \"AtWxIDList\": [],      \"ImageContent\": \"\",      \"MsgType\": 0,      \"TextContent\": \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\",      \"ToUserName\": \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\"    }  ]}"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "WxManager sendTextMessage -> "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->Ii0i()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    const-string p2, "key"

    invoke-virtual {p1, p2, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object p2, Lkotlin/text/Charsets;->XIi00iiXO:Ljava/nio/charset/Charset;

    invoke-virtual {v1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    const-string v0, "getBytes(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addByteBody([B)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->Ii0i()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object p2, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/reflect/Type;

    const-class v0, [Lcom/sma/smartv3/biz/wx/data/WxSendTextResult;

    const/4 v1, 0x0

    aput-object v0, p2, v1

    const-class v0, Lcom/sma/smartv3/biz/wx/data/WxResponse;

    invoke-static {v0, p2}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p2

    new-instance v0, Lcom/sma/smartv3/biz/wx/WxManager$sendTextMessage$1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/wx/WxManager$sendTextMessage$1;-><init>()V

    invoke-virtual {p1, p2, v0}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public final iIXi1iiXI()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleAddress()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WX_AUTH_KEY_"

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

.method public final iIi0(I)V
    .locals 0

    sput p1, Lcom/sma/smartv3/biz/wx/WxManager;->XiOIii1:I

    return-void
.end method

.method public final iIi1()V
    .locals 14

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->IO0II0i()Lcom/sma/smartv3/biz/wx/data/WxProfile;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v2, "WxManager sendLoginSuccessToDevice"

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v3, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v4, Lcom/szabh/smable3/BleKey;->CHAT_APP:Lcom/szabh/smable3/BleKey;

    sget-object v5, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v6, Lcom/szabh/smable3/entity/BleChatApp;

    const-string v1, ""

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/wx/data/WxProfile;->getUserInfo()Lcom/sma/smartv3/biz/wx/data/WxUserInfo;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;->getUserName()Lcom/sma/smartv3/biz/wx/data/WxString;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/wx/data/WxString;->getStr()Ljava/lang/String;

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

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/wx/data/WxProfile;->getUserInfo()Lcom/sma/smartv3/biz/wx/data/WxUserInfo;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;->getNickName()Lcom/sma/smartv3/biz/wx/data/WxString;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/wx/data/WxString;->getStr()Ljava/lang/String;

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

    const/16 v7, 0xf

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

.method public final iOI(Lkotlin/jvm/functions/Function1;)V
    .locals 5
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

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->iIXi1iiXI()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WxManager logout -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->XOX0O0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/androidnetworking/AndroidNetworking;->get(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v1

    const-string v2, "key"

    invoke-virtual {v1, v2, v0}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->XOX0O0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v0

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v0

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/reflect/Type;

    const-class v3, Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-class v3, Lcom/sma/smartv3/biz/wx/data/WxResponse;

    invoke-static {v3, v2}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/biz/wx/WxManager$logout$1;

    invoke-direct {v3, p1}, Lcom/sma/smartv3/biz/wx/WxManager$logout$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2, v3}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    sget-object p1, Lcom/sma/smartv3/biz/wx/WxManager;->IO:Lcom/android/mltcode/paycertificationapi/n77;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/n77;->XOO0ii0()V

    :cond_0
    sget-object p1, Lcom/sma/smartv3/biz/wx/WxManager;->iIiiO:Lkotlinx/coroutines/XiOIO;

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    invoke-static {p1, v0, v1, v0}, Lkotlinx/coroutines/XiOIO$OXO1;->XIi00iiXO(Lkotlinx/coroutines/XiOIO;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final iOO1ii1()Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->iIXi1iiXI()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WxManager checkLoginQrcodeStatus -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    sget-object v2, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->NotScanned:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    iput-object v2, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    new-instance v2, Lcom/sma/smartv3/biz/wx/WxManager$checkLoginQrcodeStatus$1;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lcom/sma/smartv3/biz/wx/WxManager$checkLoginQrcodeStatus$1;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V

    const/4 v0, 0x1

    invoke-static {v3, v2, v0, v3}, Lcom/android/mltcode/paycertificationapi/I100X1;->XOO0ii0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    return-object v0
.end method

.method public final iOX()V
    .locals 2

    sget-boolean v0, Lcom/sma/smartv3/biz/wx/WxManager;->OIX0iXi:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "WxManager -> startRealTime"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/biz/wx/WxManager$XIi00iiXO;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/wx/WxManager$XIi00iiXO;-><init>()V

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->executeByIo(Lcom/blankj/utilcode/util/ThreadUtils$Task;)V

    return-void
.end method

.method public final iOiXi11II(Lkotlin/jvm/functions/Function1;)V
    .locals 6
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

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->iIXi1iiXI()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "RAW_WEATHER_REALTIME"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x5f

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v4, Lcom/sma/smartv3/model/WeatherRealtime;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/model/WeatherRealtime;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeatherRealtime;->getName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    const-string v1, ""

    :cond_1
    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v3, Lcom/sma/smartv3/biz/wx/WxManager;->X0O:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "WxManager getLoginQrCode -> "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->X11I()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    const-string v3, "key"

    invoke-virtual {v2, v3, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    const-string v2, "city"

    invoke-virtual {v0, v2, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    const-string v1, "ipadOrmac"

    sget-object v2, Lcom/sma/smartv3/biz/wx/WxManager;->X0O:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    sget-object v1, Lkotlin/text/Charsets;->XIi00iiXO:Ljava/nio/charset/Charset;

    const-string v2, "{\"Check\": true,\"Proxy\": \"socks5://root:z567456781@47.115.60.222:7888\"}"

    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    const-string v2, "getBytes(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addByteBody([B)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {v1}, Lcom/sma/smartv3/network/NetWorkUtils;->getHeadersMap()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addHeaders(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->X11I()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/reflect/Type;

    const-class v2, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCode;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Lcom/sma/smartv3/biz/wx/data/WxResponse;

    invoke-static {v2, v1}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/biz/wx/WxManager$getLoginQrCode$1;

    invoke-direct {v2, p1}, Lcom/sma/smartv3/biz/wx/WxManager$getLoginQrCode$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public final iX1O1()V
    .locals 8

    sget-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->iIiiO:Lkotlinx/coroutines/XiOIO;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/XiOIO$OXO1;->XIi00iiXO(Lkotlinx/coroutines/XiOIO;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/I0IIOi;->OXO1(Lkotlin/coroutines/CoroutineContext;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v2

    new-instance v5, Lcom/sma/smartv3/biz/wx/WxManager$checkWsManagerConnected$1;

    invoke-direct {v5, v1}, Lcom/sma/smartv3/biz/wx/WxManager$checkWsManagerConnected$1;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->iIiiO:Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public final iXi(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->iIXi1iiXI()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "WxManager sendLoggingVerificationUrl -> "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->XOO0XOOii()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    const-string v3, "key"

    invoke-virtual {v2, v3, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->XOO0XOOii()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object v0, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/reflect/Type;

    const-class v1, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCode;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/sma/smartv3/biz/wx/data/WxResponse;

    invoke-static {v1, v0}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/biz/wx/WxManager$sendCodeVerificationLogin$1;

    invoke-direct {v1, p2}, Lcom/sma/smartv3/biz/wx/WxManager$sendCodeVerificationLogin$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0, v1}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public final iXiX011(Lkotlin/jvm/functions/Function1;)V
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

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "WxManager getAuthKey"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->iiiO()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    const-string v1, "key"

    const-string v2, "stay33"

    invoke-virtual {v0, v1, v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->iiiO()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {v1}, Lcom/sma/smartv3/network/NetWorkUtils;->getHeadersMap()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addHeaders(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/reflect/Type;

    const-class v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Lcom/sma/smartv3/biz/wx/data/WxResponse;

    invoke-static {v2, v1}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/biz/wx/WxManager$getAuthKey$1;

    invoke-direct {v2, p1}, Lcom/sma/smartv3/biz/wx/WxManager$getAuthKey$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public final iXiiiO()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->XXO()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "https://"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/wechat/login/CheckLoginStatus"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final iiII(Ljava/lang/String;Ljava/io/File;)V
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/io/File;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const/4 v0, 0x1

    const-string v1, "toUser"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "file"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->iIXi1iiXI()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-boolean v5, Lcom/sma/smartv3/biz/wx/WxManager;->I0IIOi:Z

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "WxManager sendVoice -> "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, ", "

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-boolean v4, Lcom/sma/smartv3/biz/wx/WxManager;->I0IIOi:Z

    if-nez v4, :cond_1

    invoke-static {p2}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    sput-boolean v0, Lcom/sma/smartv3/biz/wx/WxManager;->I0IIOi:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->IXI()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/androidnetworking/AndroidNetworking;->upload(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object v4

    const-string v5, "key"

    invoke-virtual {v4, v5, v3}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->addMultipartParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object v3

    invoke-virtual {v3, v1, p1}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->addMultipartParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object p1

    invoke-virtual {p1, v2, p2}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->addMultipartFile(Ljava/lang/String;Ljava/io/File;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->IXI()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object p1

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, v1}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    new-instance v1, Lcom/android/mltcode/paycertificationapi/u77;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/u77;-><init>()V

    invoke-virtual {p1, v1}, Lcom/androidnetworking/common/ANRequest;->setUploadProgressListener(Lcom/androidnetworking/interfaces/UploadProgressListener;)Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/reflect/Type;

    const-class v1, Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/sma/smartv3/biz/wx/data/WxResponse;

    invoke-static {v1, v0}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/biz/wx/WxManager$sendVoice$2;

    invoke-direct {v1, p2}, Lcom/sma/smartv3/biz/wx/WxManager$sendVoice$2;-><init>(Ljava/io/File;)V

    invoke-virtual {p1, v0, v1}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final iiIOiX()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->XXO()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "https://"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/wechat/login/WakeUpLogin"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final iiiO()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager;->XXO()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "https://"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/wechat/admin/GenAuthKey1"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
