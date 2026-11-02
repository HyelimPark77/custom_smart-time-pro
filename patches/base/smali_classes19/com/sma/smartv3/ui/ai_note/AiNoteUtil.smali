.class public final Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static I0IIOi:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static I0iXXO:I

.field public static final IO:Lcom/android/mltcode/paycertificationapi/cr4;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final IiI10X:Lcom/sma/smartv3/biz/voice/OpusManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final O00:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final O10IXXX0X:Lcom/android/mltcode/paycertificationapi/ty0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/ty0<",
            "Lcom/android/mltcode/paycertificationapi/mq4;",
            ">;"
        }
    .end annotation
.end field

.field public static OIX0iXi:Z

.field public static OIi0:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final OXO1:Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static X1ii:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public static final XIi00iiXO:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final XO0O10:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final XOO0ii0:Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final XXI:Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$callback$1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final iO:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;-><init>()V

    sput-object v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->OXO1:Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;

    const-string v1, "AiNoteUtil"

    sput-object v1, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->XIi00iiXO:Ljava/lang/String;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OIXIX;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/OIXIX;-><init>()V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    sput-object v1, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->iO:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IOiXiXO00;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/IOiXiXO00;-><init>()V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    sput-object v1, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->XO0O10:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i0iX110X;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/i0iX110X;-><init>()V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    sput-object v1, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->O00:Lkotlin/Lazy;

    new-instance v1, Lcom/sma/smartv3/biz/voice/OpusManager;

    invoke-direct {v1}, Lcom/sma/smartv3/biz/voice/OpusManager;-><init>()V

    sput-object v1, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->IiI10X:Lcom/sma/smartv3/biz/voice/OpusManager;

    new-instance v1, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v2}, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->XOO0ii0:Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;

    const-string v1, "zh"

    sput-object v1, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->I0IIOi:Ljava/lang/String;

    const-string v1, "en"

    sput-object v1, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->OIi0:Ljava/lang/String;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/cr4;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/cr4;-><init>()V

    sput-object v1, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->IO:Lcom/android/mltcode/paycertificationapi/cr4;

    new-instance v1, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$callback$1;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$callback$1;-><init>()V

    sput-object v1, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->XXI:Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$callback$1;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->I1()V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->X01IiOiIi()Lkotlinx/coroutines/XiOIO;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->iOOX010X()Lkotlinx/coroutines/XiOIO;

    const-string v0, ""

    sput-object v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->X1ii:Ljava/lang/String;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/mq4;

    const/16 v8, 0x3b

    const/4 v9, 0x0

    const/4 v3, 0x0

    const-string v4, "-10086"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lcom/android/mltcode/paycertificationapi/mq4;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/l85;->OXO1(Ljava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->O10IXXX0X:Lcom/android/mltcode/paycertificationapi/ty0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic I0IIOi()I
    .locals 1

    sget v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->I0iXXO:I

    return v0
.end method

.method public static final synthetic I0iXXO(Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;)Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->iX()Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic I1XOi1()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->OIX0iXi:Z

    return v0
.end method

.method public static final synthetic IIX1OXO(Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;Ljava/lang/String;I)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->iI(Ljava/lang/String;I)V

    return-void
.end method

.method public static final synthetic IO(Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->i010I()Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic IiI10X()Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$callback$1;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->XXI:Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$callback$1;

    return-object v0
.end method

.method public static final synthetic O00()Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->XOO0ii0:Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;

    return-object v0
.end method

.method public static final synthetic O10IXXX0X(Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;)Lcom/sma/smartv3/ui/translate/sparkchain/iO;
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->IXXOO()Lcom/sma/smartv3/ui/translate/sparkchain/iO;

    move-result-object p0

    return-object p0
.end method

.method public static final O1O()Lcom/android/mltcode/paycertificationapi/i00OIXiO;
    .locals 3

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, Lcom/android/mltcode/paycertificationapi/ng5;->iO(Lkotlinx/coroutines/XiOIO;ILjava/lang/Object;)Lkotlinx/coroutines/O00;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/I0IIOi;->OXO1(Lkotlin/coroutines/CoroutineContext;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic OII(Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->X1IX()V

    return-void
.end method

.method public static final synthetic OIX0iXi()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->X1ii:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic OIi0()Lcom/android/mltcode/paycertificationapi/cr4;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->IO:Lcom/android/mltcode/paycertificationapi/cr4;

    return-object v0
.end method

.method public static synthetic OXO1()Lcom/android/mltcode/paycertificationapi/i00OIXiO;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->O1O()Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic OiIIX101O(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->OIi0:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic X0O()Lcom/android/mltcode/paycertificationapi/ty0;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->O10IXXX0X:Lcom/android/mltcode/paycertificationapi/ty0;

    return-object v0
.end method

.method public static final X0i1O()Lcom/sma/smartv3/ui/translate/sparkchain/iO;
    .locals 1

    new-instance v0, Lcom/sma/smartv3/ui/translate/sparkchain/iO;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/translate/sparkchain/iO;-><init>()V

    return-object v0
.end method

.method public static final X11iII1O1()Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;

    sget-object v1, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->OXO1:Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->i010I()Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;-><init>(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V

    return-object v0
.end method

.method public static final synthetic X1ii()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->OIi0:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic XIi00iiXO()Lcom/sma/smartv3/ui/translate/sparkchain/iO;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->X0i1O()Lcom/sma/smartv3/ui/translate/sparkchain/iO;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic XO0O10(Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->OX()V

    return-void
.end method

.method public static final synthetic XOO0ii0()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->I0IIOi:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic XX0(I)V
    .locals 0

    sput p0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->I0iXXO:I

    return-void
.end method

.method public static final synthetic XXI()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->XIi00iiXO:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic XiOIO(Z)V
    .locals 0

    sput-boolean p0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->OIX0iXi:Z

    return-void
.end method

.method public static final synthetic XiOIii1(Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->XXX11i()V

    return-void
.end method

.method public static final synthetic iIiiO(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->I0IIOi:Ljava/lang/String;

    return-void
.end method

.method public static synthetic iO()Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->X11iII1O1()Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic iX1O1(Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;Ljava/lang/String;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->iI(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final I1()V
    .locals 6

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->i010I()Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1;

    const/4 v1, 0x0

    invoke-direct {v3, v1}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public final II1Xi0()Lcom/sma/smartv3/biz/voice/OpusManager;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->IiI10X:Lcom/sma/smartv3/biz/voice/OpusManager;

    return-object v0
.end method

.method public final IXXOO()Lcom/sma/smartv3/ui/translate/sparkchain/iO;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->XO0O10:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/translate/sparkchain/iO;

    return-object v0
.end method

.method public final OX()V
    .locals 7

    sget-object v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->O10IXXX0X:Lcom/android/mltcode/paycertificationapi/ty0;

    invoke-interface {v0}, Lcom/android/mltcode/paycertificationapi/ty0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/mq4;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/mq4;->OIi0()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->X1ii:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    sget-boolean v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->OIX0iXi:Z

    if-eqz v0, :cond_1

    sget-object v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->IO:Lcom/android/mltcode/paycertificationapi/cr4;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/cr4;->O00()I

    move-result v0

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->IO:Lcom/android/mltcode/paycertificationapi/cr4;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/cr4;->IO()I

    move-result v0

    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->i010I()Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    new-instance v4, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;

    const/4 v3, 0x0

    invoke-direct {v4, v0, v3}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$addAiNote$1;-><init>(ILkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    :cond_2
    :goto_1
    return-void
.end method

.method public final X01IiOiIi()Lkotlinx/coroutines/XiOIO;
    .locals 6

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->i010I()Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectState$1;

    const/4 v2, 0x0

    invoke-direct {v3, v2}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectState$1;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object v0

    return-object v0
.end method

.method public final X1IX()V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->IiI10X:Lcom/sma/smartv3/biz/voice/OpusManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/OpusManager;->stopDecodeStream()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->IXXOO()Lcom/sma/smartv3/ui/translate/sparkchain/iO;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/translate/sparkchain/iO;->I0IIOi()V

    return-void
.end method

.method public final XXIIO1i11(Lcom/szabh/smable3/entity/BleVoice;)V
    .locals 10
    .param p1    # Lcom/szabh/smable3/entity/BleVoice;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "voice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->I0OX()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v1, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->XIi00iiXO:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " bleVoice:"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v3, Lcom/szabh/smable3/BleKey;->AUDIO_TEXT:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v5, p1

    invoke-static/range {v2 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final XXX11i()V
    .locals 10

    const-string v0, ""

    sput-object v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->X1ii:Ljava/lang/String;

    sget-object v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->O10IXXX0X:Lcom/android/mltcode/paycertificationapi/ty0;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/mq4;

    const/16 v8, 0x3b

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, "-10086"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lcom/android/mltcode/paycertificationapi/mq4;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Lcom/android/mltcode/paycertificationapi/ty0;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->iX()Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;->XO0O10()Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public final i010I()Lcom/android/mltcode/paycertificationapi/i00OIXiO;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->iO:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    return-object v0
.end method

.method public final iI(Ljava/lang/String;I)V
    .locals 7

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->i010I()Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    new-instance v4, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$sendMsgToDevice$1;

    const/4 v0, 0x0

    invoke-direct {v4, p1, p2, v0}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$sendMsgToDevice$1;-><init>(Ljava/lang/String;ILkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    :cond_1
    :goto_0
    return-void
.end method

.method public final iOO1ii1(Lcom/szabh/smable3/entity/BleRecordPacket;)Lkotlinx/coroutines/XiOIO;
    .locals 7
    .param p1    # Lcom/szabh/smable3/entity/BleRecordPacket;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "recordPacket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->i010I()Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    new-instance v4, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$saveAiNote$1;

    const/4 v0, 0x0

    invoke-direct {v4, p1, v0}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$saveAiNote$1;-><init>(Lcom/szabh/smable3/entity/BleRecordPacket;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object p1

    return-object p1
.end method

.method public final iOOX010X()Lkotlinx/coroutines/XiOIO;
    .locals 6

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->i010I()Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectPlayer$1;

    const/4 v2, 0x0

    invoke-direct {v3, v2}, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil$collectPlayer$1;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object v0

    return-object v0
.end method

.method public final iX()Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/ai_note/AiNoteUtil;->O00:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager;

    return-object v0
.end method
