.class public final Lcom/sma/smartv3/model/UploadWorkoutData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private airPressure:I

.field private altitude:I

.field private calorie:I

.field private distance:I

.field private duration:I

.field private end:J

.field private is_delete:I

.field private mAvgBpm:I

.field private mAvgStress:I

.field private mBleName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mFeel:I

.field private mFirmwareFlag:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mMaxAltitude:I

.field private mMaxBpm:I

.field private mMaxPace:I

.field private mMaxSpm:I

.field private mMaxStress:I

.field private mMinAltitude:I

.field private mMinBpm:I

.field private mMinPace:I

.field private mMinSpm:I

.field private mMinStress:I

.field private mPrototype:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mSource:I

.field private mode:I

.field private pace:I

.field private speed:I

.field private spm:I

.field private start:J

.field private step:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mPrototype:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mFirmwareFlag:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mBleName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getAirPressure()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->airPressure:I

    return v0
.end method

.method public final getAltitude()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->altitude:I

    return v0
.end method

.method public final getCalorie()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->calorie:I

    return v0
.end method

.method public final getDistance()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->distance:I

    return v0
.end method

.method public final getDuration()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->duration:I

    return v0
.end method

.method public final getEnd()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->end:J

    return-wide v0
.end method

.method public final getMAvgBpm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mAvgBpm:I

    return v0
.end method

.method public final getMAvgStress()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mAvgStress:I

    return v0
.end method

.method public final getMBleName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mBleName:Ljava/lang/String;

    return-object v0
.end method

.method public final getMFeel()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mFeel:I

    return v0
.end method

.method public final getMFirmwareFlag()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mFirmwareFlag:Ljava/lang/String;

    return-object v0
.end method

.method public final getMMaxAltitude()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mMaxAltitude:I

    return v0
.end method

.method public final getMMaxBpm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mMaxBpm:I

    return v0
.end method

.method public final getMMaxPace()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mMaxPace:I

    return v0
.end method

.method public final getMMaxSpm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mMaxSpm:I

    return v0
.end method

.method public final getMMaxStress()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mMaxStress:I

    return v0
.end method

.method public final getMMinAltitude()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mMinAltitude:I

    return v0
.end method

.method public final getMMinBpm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mMinBpm:I

    return v0
.end method

.method public final getMMinPace()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mMinPace:I

    return v0
.end method

.method public final getMMinSpm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mMinSpm:I

    return v0
.end method

.method public final getMMinStress()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mMinStress:I

    return v0
.end method

.method public final getMPrototype()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mPrototype:Ljava/lang/String;

    return-object v0
.end method

.method public final getMSource()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mSource:I

    return v0
.end method

.method public final getMode()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mode:I

    return v0
.end method

.method public final getPace()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->pace:I

    return v0
.end method

.method public final getSpeed()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->speed:I

    return v0
.end method

.method public final getSpm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->spm:I

    return v0
.end method

.method public final getStart()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->start:J

    return-wide v0
.end method

.method public final getStep()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->step:I

    return v0
.end method

.method public final is_delete()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->is_delete:I

    return v0
.end method

.method public final setAirPressure(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->airPressure:I

    return-void
.end method

.method public final setAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->altitude:I

    return-void
.end method

.method public final setCalorie(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->calorie:I

    return-void
.end method

.method public final setDistance(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->distance:I

    return-void
.end method

.method public final setDuration(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->duration:I

    return-void
.end method

.method public final setEnd(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->end:J

    return-void
.end method

.method public final setMAvgBpm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mAvgBpm:I

    return-void
.end method

.method public final setMAvgStress(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mAvgStress:I

    return-void
.end method

.method public final setMBleName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mBleName:Ljava/lang/String;

    return-void
.end method

.method public final setMFeel(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mFeel:I

    return-void
.end method

.method public final setMFirmwareFlag(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mFirmwareFlag:Ljava/lang/String;

    return-void
.end method

.method public final setMMaxAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mMaxAltitude:I

    return-void
.end method

.method public final setMMaxBpm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mMaxBpm:I

    return-void
.end method

.method public final setMMaxPace(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mMaxPace:I

    return-void
.end method

.method public final setMMaxSpm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mMaxSpm:I

    return-void
.end method

.method public final setMMaxStress(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mMaxStress:I

    return-void
.end method

.method public final setMMinAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mMinAltitude:I

    return-void
.end method

.method public final setMMinBpm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mMinBpm:I

    return-void
.end method

.method public final setMMinPace(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mMinPace:I

    return-void
.end method

.method public final setMMinSpm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mMinSpm:I

    return-void
.end method

.method public final setMMinStress(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mMinStress:I

    return-void
.end method

.method public final setMPrototype(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mPrototype:Ljava/lang/String;

    return-void
.end method

.method public final setMSource(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mSource:I

    return-void
.end method

.method public final setMode(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->mode:I

    return-void
.end method

.method public final setPace(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->pace:I

    return-void
.end method

.method public final setSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->speed:I

    return-void
.end method

.method public final setSpm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->spm:I

    return-void
.end method

.method public final setStart(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->start:J

    return-void
.end method

.method public final setStep(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->step:I

    return-void
.end method

.method public final set_delete(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/UploadWorkoutData;->is_delete:I

    return-void
.end method
