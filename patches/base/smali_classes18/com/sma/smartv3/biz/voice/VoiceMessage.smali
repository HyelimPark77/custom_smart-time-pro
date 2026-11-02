.class public final Lcom/sma/smartv3/biz/voice/VoiceMessage;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/biz/voice/VoiceMessage$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Deprecated;
    message = ""
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/biz/voice/VoiceMessage$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final STATUS_FAIL:I = 0x2

.field public static final STATUS_NORMAL:I = 0x0

.field public static final STATUS_WAIT:I = 0x1

.field public static final STATUS_WORKING:I = 0x3

.field public static final TYPE_RECEIVED:I = 0x2

.field public static final TYPE_RECEIVED_AUDIO:I = 0x3

.field public static final TYPE_SEND:I = 0x1

.field public static final TYPE_SEND_AUDIO:I = 0x4

.field public static final TYPE_SYSTEM:I = 0x4


# instance fields
.field private mAIMode:I

.field private mContent:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mExtraInfo:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mId:I

.field private mLocalTime:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mStatus:I

.field private mType:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/biz/voice/VoiceMessage$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/biz/voice/VoiceMessage$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->Companion:Lcom/sma/smartv3/biz/voice/VoiceMessage$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/sma/smartv3/biz/voice/VoiceMessage;-><init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;II)V
    .locals 1
    .param p2    # Ljava/lang/String;
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

    const-string v0, "mLocalTime"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mContent"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mExtraInfo"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mId:I

    .line 4
    iput-object p2, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mLocalTime:Ljava/lang/String;

    .line 5
    iput p3, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mType:I

    .line 6
    iput-object p4, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mContent:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mExtraInfo:Ljava/lang/String;

    .line 8
    iput p6, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mStatus:I

    .line 9
    iput p7, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mAIMode:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p9, p8, 0x1

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    .line 10
    const-string v1, ""

    if-eqz p9, :cond_1

    move-object p2, v1

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    move-object p4, v1

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    move-object p5, v1

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    const/4 p7, -0x1

    :cond_6
    move p8, p7

    move p7, p6

    move-object p6, p5

    move-object p5, p4

    move p4, p3

    move-object p3, p2

    move p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p8}, Lcom/sma/smartv3/biz/voice/VoiceMessage;-><init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;II)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/biz/voice/VoiceMessage;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILjava/lang/Object;)Lcom/sma/smartv3/biz/voice/VoiceMessage;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget p1, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mId:I

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mLocalTime:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget p3, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mType:I

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mContent:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mExtraInfo:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget p6, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mStatus:I

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget p7, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mAIMode:I

    :cond_6
    move p8, p6

    move p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/sma/smartv3/biz/voice/VoiceMessage;->copy(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;II)Lcom/sma/smartv3/biz/voice/VoiceMessage;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mId:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mLocalTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mType:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mContent:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mExtraInfo:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mStatus:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mAIMode:I

    return v0
.end method

.method public final copy(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;II)Lcom/sma/smartv3/biz/voice/VoiceMessage;
    .locals 9
    .param p2    # Ljava/lang/String;
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
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mLocalTime"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mContent"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mExtraInfo"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    move v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/sma/smartv3/biz/voice/VoiceMessage;-><init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;II)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/biz/voice/VoiceMessage;

    iget v1, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mId:I

    iget v3, p1, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mLocalTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mLocalTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mType:I

    iget v3, p1, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mType:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mContent:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mContent:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mExtraInfo:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mExtraInfo:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mStatus:I

    iget v3, p1, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mStatus:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mAIMode:I

    iget p1, p1, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mAIMode:I

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getMAIMode()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mAIMode:I

    return v0
.end method

.method public final getMContent()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mContent:Ljava/lang/String;

    return-object v0
.end method

.method public final getMExtraInfo()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mExtraInfo:Ljava/lang/String;

    return-object v0
.end method

.method public final getMId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mId:I

    return v0
.end method

.method public final getMLocalTime()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mLocalTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getMStatus()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mStatus:I

    return v0
.end method

.method public final getMType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mType:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mLocalTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mContent:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mExtraInfo:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mStatus:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mAIMode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAIMode(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mAIMode:I

    return-void
.end method

.method public final setMContent(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mContent:Ljava/lang/String;

    return-void
.end method

.method public final setMExtraInfo(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mExtraInfo:Ljava/lang/String;

    return-void
.end method

.method public final setMLocalTime(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mLocalTime:Ljava/lang/String;

    return-void
.end method

.method public final setMStatus(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mStatus:I

    return-void
.end method

.method public final setMType(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mType:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 9
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mId:I

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mLocalTime:Ljava/lang/String;

    iget v2, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mType:I

    iget-object v3, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mContent:Ljava/lang/String;

    iget-object v4, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mExtraInfo:Ljava/lang/String;

    iget v5, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mStatus:I

    iget v6, p0, Lcom/sma/smartv3/biz/voice/VoiceMessage;->mAIMode:I

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "VoiceMessage(mId="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mLocalTime="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", mType="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mContent="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", mExtraInfo="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", mStatus="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mAIMode="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
