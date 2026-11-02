.class public final Lcom/szabh/smable3/entity/BleLeaveDay;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleLeaveDay$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleAICoachPlanV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleAICoachPlanV2.kt\ncom/szabh/smable3/entity/BleLeaveDay\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,327:1\n222#2,4:328\n*S KotlinDebug\n*F\n+ 1 BleAICoachPlanV2.kt\ncom/szabh/smable3/entity/BleLeaveDay\n*L\n217#1:328,4\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleAICoachPlanV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleAICoachPlanV2.kt\ncom/szabh/smable3/entity/BleLeaveDay\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,327:1\n222#2,4:328\n*S KotlinDebug\n*F\n+ 1 BleAICoachPlanV2.kt\ncom/szabh/smable3/entity/BleLeaveDay\n*L\n217#1:328,4\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleLeaveDay$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final LEAVE_CANCELLATION:I = 0x0

.field public static final LEAVE_REQUEST:I = 0x1


# instance fields
.field private mLeaveDayV2:J

.field private type:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleLeaveDay$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleLeaveDay$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleLeaveDay;->Companion:Lcom/szabh/smable3/entity/BleLeaveDay$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/szabh/smable3/entity/BleLeaveDay;-><init>(IJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleLeaveDay;->type:I

    .line 4
    iput-wide p2, p0, Lcom/szabh/smable3/entity/BleLeaveDay;->mLeaveDayV2:J

    return-void
.end method

.method public synthetic constructor <init>(IJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const-wide/16 p2, 0x0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/szabh/smable3/entity/BleLeaveDay;-><init>(IJ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleLeaveDay;IJILjava/lang/Object;)Lcom/szabh/smable3/entity/BleLeaveDay;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleLeaveDay;->type:I

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    iget-wide p2, p0, Lcom/szabh/smable3/entity/BleLeaveDay;->mLeaveDayV2:J

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/szabh/smable3/entity/BleLeaveDay;->copy(IJ)Lcom/szabh/smable3/entity/BleLeaveDay;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLeaveDay;->type:I

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleLeaveDay;->mLeaveDayV2:J

    return-wide v0
.end method

.method public final copy(IJ)Lcom/szabh/smable3/entity/BleLeaveDay;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleLeaveDay;

    invoke-direct {v0, p1, p2, p3}, Lcom/szabh/smable3/entity/BleLeaveDay;-><init>(IJ)V

    return-object v0
.end method

.method public decode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleLeaveDay;->type:I

    sget-object v0, Lcom/szabh/smable3/entity/BleTime;->Companion:Lcom/szabh/smable3/entity/BleTime$Companion;

    const-class v1, Lcom/szabh/smable3/entity/BleTime;

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bestmafen/baseble/data/BleReadable;

    const/4 v2, 0x6

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v1}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v1, Lcom/szabh/smable3/entity/BleTime;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/BleTime$Companion;->timeInMillis(Lcom/szabh/smable3/entity/BleTime;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/szabh/smable3/entity/BleLeaveDay;->mLeaveDayV2:J

    return-void
.end method

.method public encode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleLeaveDay;->type:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    sget-object v0, Lcom/szabh/smable3/entity/BleTime;->Companion:Lcom/szabh/smable3/entity/BleTime$Companion;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleLeaveDay;->mLeaveDayV2:J

    invoke-virtual {v0, v1, v2}, Lcom/szabh/smable3/entity/BleTime$Companion;->ofLocal(J)Lcom/szabh/smable3/entity/BleTime;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleLeaveDay;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleLeaveDay;

    iget v1, p0, Lcom/szabh/smable3/entity/BleLeaveDay;->type:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleLeaveDay;->type:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/szabh/smable3/entity/BleLeaveDay;->mLeaveDayV2:J

    iget-wide v5, p1, Lcom/szabh/smable3/entity/BleLeaveDay;->mLeaveDayV2:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getMLeaveDayV2()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleLeaveDay;->mLeaveDayV2:J

    return-wide v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/4 v0, 0x7

    return v0
.end method

.method public final getType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleLeaveDay;->type:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/szabh/smable3/entity/BleLeaveDay;->type:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleLeaveDay;->mLeaveDayV2:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMLeaveDayV2(J)V
    .locals 0

    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleLeaveDay;->mLeaveDayV2:J

    return-void
.end method

.method public final setType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleLeaveDay;->type:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleLeaveDay(type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleLeaveDay;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLeaveDayV2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleLeaveDay;->mLeaveDayV2:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
