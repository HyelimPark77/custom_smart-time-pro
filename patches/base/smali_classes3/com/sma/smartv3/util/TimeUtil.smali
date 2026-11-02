.class public final Lcom/sma/smartv3/util/TimeUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTimeUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeUtil.kt\ncom/sma/smartv3/util/TimeUtil\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,96:1\n189#2:97\n*S KotlinDebug\n*F\n+ 1 TimeUtil.kt\ncom/sma/smartv3/util/TimeUtil\n*L\n21#1:97\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTimeUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeUtil.kt\ncom/sma/smartv3/util/TimeUtil\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,96:1\n189#2:97\n*S KotlinDebug\n*F\n+ 1 TimeUtil.kt\ncom/sma/smartv3/util/TimeUtil\n*L\n21#1:97\n*E\n"
    }
.end annotation


# static fields
.field public static final OXO1:Lcom/sma/smartv3/util/TimeUtil;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/util/TimeUtil;

    invoke-direct {v0}, Lcom/sma/smartv3/util/TimeUtil;-><init>()V

    sput-object v0, Lcom/sma/smartv3/util/TimeUtil;->OXO1:Lcom/sma/smartv3/util/TimeUtil;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/util/TimeUtil;Lcom/android/mltcode/paycertificationapi/k85;JILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ii0iIIX0;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const-wide/16 p2, 0x3e8

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/util/TimeUtil;->OXO1(Lcom/android/mltcode/paycertificationapi/k85;J)Lcom/android/mltcode/paycertificationapi/ii0iIIX0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final IiI10X(Ljava/util/Calendar;Ljava/util/Calendar;)I
    .locals 4
    .param p1    # Ljava/util/Calendar;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/util/Calendar;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "start"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "end"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide p1

    sub-long/2addr v0, p1

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toDays(J)J

    move-result-wide v2

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toHours(J)J

    move-result-wide p1

    const/16 v0, 0x18

    int-to-long v0, v0

    rem-long/2addr p1, v0

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-lez p1, :cond_0

    const-wide/16 p1, 0x1

    add-long/2addr v2, p1

    long-to-int p1, v2

    return p1

    :cond_0
    long-to-int p1, v2

    return p1
.end method

.method public final O00(J)Ljava/lang/String;
    .locals 5
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const v0, 0x36ee80

    int-to-long v0, v0

    div-long v2, p1, v0

    long-to-int v2, v2

    rem-long v0, p1, v0

    const v3, 0xea60

    int-to-long v3, v3

    div-long/2addr v0, v3

    long-to-int v0, v0

    rem-long/2addr p1, v3

    const/16 v1, 0x3e8

    int-to-long v3, v1

    div-long/2addr p1, v3

    long-to-int p1, p1

    sget-object p2, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p2, v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x3

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string p2, "%02d:%02d:%02d"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "format(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final OXO1(Lcom/android/mltcode/paycertificationapi/k85;J)Lcom/android/mltcode/paycertificationapi/ii0iIIX0;
    .locals 2
    .param p1    # Lcom/android/mltcode/paycertificationapi/k85;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Ljava/lang/Boolean;",
            ">;J)",
            "Lcom/android/mltcode/paycertificationapi/ii0iIIX0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "isSpeaking"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p2, p3}, Lcom/sma/smartv3/util/TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1;-><init>(Lkotlin/coroutines/Continuation;J)V

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/iX0XiO;->OX0X1O10X(Lcom/android/mltcode/paycertificationapi/ii0iIIX0;Lkotlin/jvm/functions/Function3;)Lcom/android/mltcode/paycertificationapi/ii0iIIX0;

    move-result-object p1

    return-object p1
.end method

.method public final XO0O10(III)Ljava/util/Calendar;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->clear()V

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/Calendar;->set(III)V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final XOO0ii0(I)Ljava/lang/String;
    .locals 4
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    if-lez p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/util/TimeUtil;->iO(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/util/TimeUtil;->iO(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, "0"

    const/4 v3, 0x0

    invoke-static {p1, v2, v3, v0, v1}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final iO(I)Ljava/lang/String;
    .locals 3

    div-int/lit8 v0, p1, 0x3c

    rem-int/lit8 p1, p1, 0x3c

    const-string v1, "\u5206"

    if-lez v0, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\u65f6"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
