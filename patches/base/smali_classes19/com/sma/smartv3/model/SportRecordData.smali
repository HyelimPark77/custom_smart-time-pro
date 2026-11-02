.class public final Lcom/sma/smartv3/model/SportRecordData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/model/SportRecordData$CREATOR;
    }
.end annotation


# static fields
.field public static final CREATOR:Lcom/sma/smartv3/model/SportRecordData$CREATOR;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field private mCalorie:I

.field private mDistance:I

.field private mDuration:I

.field private mEndTime:J

.field private mIsLocationEmpty:Z

.field private mMode:I

.field private mPace:I

.field private mPlatform:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mSource:I

.field private mSpeed:I

.field private mStartTime:J

.field private mWorkoutId:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/model/SportRecordData$CREATOR;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/model/SportRecordData$CREATOR;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/model/SportRecordData;->CREATOR:Lcom/sma/smartv3/model/SportRecordData$CREATOR;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mIsLocationEmpty:Z

    .line 3
    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mPlatform:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2
    .param p1    # Landroid/os/Parcel;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Lcom/sma/smartv3/model/SportRecordData;-><init>()V

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mStartTime:J

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mEndTime:J

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mMode:I

    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mSource:I

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mIsLocationEmpty:Z

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mWorkoutId:I

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mDistance:I

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mPace:I

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mCalorie:I

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mDuration:I

    .line 15
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mPlatform:Ljava/lang/String;

    .line 16
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/model/SportRecordData;->mSpeed:I

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getMCalorie()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mCalorie:I

    return v0
.end method

.method public final getMDistance()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mDistance:I

    return v0
.end method

.method public final getMDuration()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mDuration:I

    return v0
.end method

.method public final getMEndTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mEndTime:J

    return-wide v0
.end method

.method public final getMIsLocationEmpty()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mIsLocationEmpty:Z

    return v0
.end method

.method public final getMMode()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mMode:I

    return v0
.end method

.method public final getMPace()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mPace:I

    return v0
.end method

.method public final getMPlatform()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mPlatform:Ljava/lang/String;

    return-object v0
.end method

.method public final getMSource()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mSource:I

    return v0
.end method

.method public final getMSpeed()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mSpeed:I

    return v0
.end method

.method public final getMStartTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mStartTime:J

    return-wide v0
.end method

.method public final getMWorkoutId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mWorkoutId:I

    return v0
.end method

.method public final setMCalorie(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/SportRecordData;->mCalorie:I

    return-void
.end method

.method public final setMDistance(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/SportRecordData;->mDistance:I

    return-void
.end method

.method public final setMDuration(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/SportRecordData;->mDuration:I

    return-void
.end method

.method public final setMEndTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/SportRecordData;->mEndTime:J

    return-void
.end method

.method public final setMIsLocationEmpty(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/model/SportRecordData;->mIsLocationEmpty:Z

    return-void
.end method

.method public final setMMode(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/SportRecordData;->mMode:I

    return-void
.end method

.method public final setMPace(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/SportRecordData;->mPace:I

    return-void
.end method

.method public final setMPlatform(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/SportRecordData;->mPlatform:Ljava/lang/String;

    return-void
.end method

.method public final setMSource(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/SportRecordData;->mSource:I

    return-void
.end method

.method public final setMSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/SportRecordData;->mSpeed:I

    return-void
.end method

.method public final setMStartTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/SportRecordData;->mStartTime:J

    return-void
.end method

.method public final setMWorkoutId(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/SportRecordData;->mWorkoutId:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 14
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-wide v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mStartTime:J

    iget-wide v2, p0, Lcom/sma/smartv3/model/SportRecordData;->mEndTime:J

    iget v4, p0, Lcom/sma/smartv3/model/SportRecordData;->mMode:I

    iget v5, p0, Lcom/sma/smartv3/model/SportRecordData;->mSource:I

    iget-boolean v6, p0, Lcom/sma/smartv3/model/SportRecordData;->mIsLocationEmpty:Z

    iget v7, p0, Lcom/sma/smartv3/model/SportRecordData;->mWorkoutId:I

    iget v8, p0, Lcom/sma/smartv3/model/SportRecordData;->mDistance:I

    iget v9, p0, Lcom/sma/smartv3/model/SportRecordData;->mPace:I

    iget v10, p0, Lcom/sma/smartv3/model/SportRecordData;->mCalorie:I

    iget v11, p0, Lcom/sma/smartv3/model/SportRecordData;->mDuration:I

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "SportRecordData(mStartTime="

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", mEndTime="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", mMode="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mSource="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mIsLocationEmpty="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", mWorkoutId="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mDistance="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mPace="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " ,mCalorie="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " ,mDuration="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2
    .param p1    # Landroid/os/Parcel;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string p2, "parcel"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mStartTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lcom/sma/smartv3/model/SportRecordData;->mEndTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget p2, p0, Lcom/sma/smartv3/model/SportRecordData;->mMode:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/sma/smartv3/model/SportRecordData;->mSource:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/sma/smartv3/model/SportRecordData;->mIsLocationEmpty:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget p2, p0, Lcom/sma/smartv3/model/SportRecordData;->mWorkoutId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/sma/smartv3/model/SportRecordData;->mDistance:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/sma/smartv3/model/SportRecordData;->mPace:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/sma/smartv3/model/SportRecordData;->mCalorie:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/sma/smartv3/model/SportRecordData;->mDuration:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/sma/smartv3/model/SportRecordData;->mPlatform:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/sma/smartv3/model/SportRecordData;->mSpeed:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
