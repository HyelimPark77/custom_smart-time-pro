.class public final Lcom/sma/smartv3/model/CustomLatLng;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/model/CustomLatLng$CREATOR;
    }
.end annotation


# static fields
.field public static final CREATOR:Lcom/sma/smartv3/model/CustomLatLng$CREATOR;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field private altitude:I

.field private color:I

.field private latitude:D

.field private longitude:D

.field private time:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/model/CustomLatLng$CREATOR;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/model/CustomLatLng$CREATOR;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/model/CustomLatLng;->CREATOR:Lcom/sma/smartv3/model/CustomLatLng$CREATOR;

    return-void
.end method

.method public constructor <init>(DDJII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lcom/sma/smartv3/model/CustomLatLng;->latitude:D

    .line 3
    iput-wide p3, p0, Lcom/sma/smartv3/model/CustomLatLng;->longitude:D

    .line 4
    iput-wide p5, p0, Lcom/sma/smartv3/model/CustomLatLng;->time:J

    .line 5
    iput p7, p0, Lcom/sma/smartv3/model/CustomLatLng;->altitude:I

    .line 6
    iput p8, p0, Lcom/sma/smartv3/model/CustomLatLng;->color:I

    return-void
.end method

.method public synthetic constructor <init>(DDJIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    and-int/lit8 v0, p9, 0x4

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    move-wide v7, v0

    goto :goto_0

    :cond_0
    move-wide/from16 v7, p5

    :goto_0
    and-int/lit8 v0, p9, 0x8

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move v9, v1

    goto :goto_1

    :cond_1
    move/from16 v9, p7

    :goto_1
    and-int/lit8 v0, p9, 0x10

    if-eqz v0, :cond_2

    move v10, v1

    :goto_2
    move-object v2, p0

    move-wide v3, p1

    move-wide v5, p3

    goto :goto_3

    :cond_2
    move/from16 v10, p8

    goto :goto_2

    .line 7
    :goto_3
    invoke-direct/range {v2 .. v10}, Lcom/sma/smartv3/model/CustomLatLng;-><init>(DDJII)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 10
    .param p1    # Landroid/os/Parcel;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v2

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v4

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v6

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v8

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v9

    move-object v1, p0

    .line 13
    invoke-direct/range {v1 .. v9}, Lcom/sma/smartv3/model/CustomLatLng;-><init>(DDJII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/CustomLatLng;DDJIIILjava/lang/Object;)Lcom/sma/smartv3/model/CustomLatLng;
    .locals 9

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Lcom/sma/smartv3/model/CustomLatLng;->latitude:D

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p9, 0x2

    if-eqz p1, :cond_1

    iget-wide p3, p0, Lcom/sma/smartv3/model/CustomLatLng;->longitude:D

    :cond_1
    move-wide v3, p3

    and-int/lit8 p1, p9, 0x4

    if-eqz p1, :cond_2

    iget-wide p5, p0, Lcom/sma/smartv3/model/CustomLatLng;->time:J

    :cond_2
    move-wide v5, p5

    and-int/lit8 p1, p9, 0x8

    if-eqz p1, :cond_3

    iget p1, p0, Lcom/sma/smartv3/model/CustomLatLng;->altitude:I

    move v7, p1

    goto :goto_0

    :cond_3
    move/from16 v7, p7

    :goto_0
    and-int/lit8 p1, p9, 0x10

    if-eqz p1, :cond_4

    iget p1, p0, Lcom/sma/smartv3/model/CustomLatLng;->color:I

    move v8, p1

    :goto_1
    move-object v0, p0

    goto :goto_2

    :cond_4
    move/from16 v8, p8

    goto :goto_1

    :goto_2
    invoke-virtual/range {v0 .. v8}, Lcom/sma/smartv3/model/CustomLatLng;->copy(DDJII)Lcom/sma/smartv3/model/CustomLatLng;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/CustomLatLng;->latitude:D

    return-wide v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/CustomLatLng;->longitude:D

    return-wide v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/CustomLatLng;->time:J

    return-wide v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/CustomLatLng;->altitude:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/CustomLatLng;->color:I

    return v0
.end method

.method public final copy(DDJII)Lcom/sma/smartv3/model/CustomLatLng;
    .locals 9
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/model/CustomLatLng;

    move-wide v1, p1

    move-wide v3, p3

    move-wide v5, p5

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/sma/smartv3/model/CustomLatLng;-><init>(DDJII)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
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
    instance-of v1, p1, Lcom/sma/smartv3/model/CustomLatLng;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/CustomLatLng;

    iget-wide v3, p0, Lcom/sma/smartv3/model/CustomLatLng;->latitude:D

    iget-wide v5, p1, Lcom/sma/smartv3/model/CustomLatLng;->latitude:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/sma/smartv3/model/CustomLatLng;->longitude:D

    iget-wide v5, p1, Lcom/sma/smartv3/model/CustomLatLng;->longitude:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/sma/smartv3/model/CustomLatLng;->time:J

    iget-wide v5, p1, Lcom/sma/smartv3/model/CustomLatLng;->time:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/sma/smartv3/model/CustomLatLng;->altitude:I

    iget v3, p1, Lcom/sma/smartv3/model/CustomLatLng;->altitude:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/sma/smartv3/model/CustomLatLng;->color:I

    iget p1, p1, Lcom/sma/smartv3/model/CustomLatLng;->color:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAltitude()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/CustomLatLng;->altitude:I

    return v0
.end method

.method public final getColor()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/CustomLatLng;->color:I

    return v0
.end method

.method public final getLatitude()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/CustomLatLng;->latitude:D

    return-wide v0
.end method

.method public final getLongitude()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/CustomLatLng;->longitude:D

    return-wide v0
.end method

.method public final getTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/CustomLatLng;->time:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/sma/smartv3/model/CustomLatLng;->latitude:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/model/CustomLatLng;->longitude:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/model/CustomLatLng;->time:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/CustomLatLng;->altitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/CustomLatLng;->color:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/CustomLatLng;->altitude:I

    return-void
.end method

.method public final setColor(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/CustomLatLng;->color:I

    return-void
.end method

.method public final setLatitude(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/CustomLatLng;->latitude:D

    return-void
.end method

.method public final setLongitude(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/CustomLatLng;->longitude:D

    return-void
.end method

.method public final setTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/CustomLatLng;->time:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 10
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-wide v0, p0, Lcom/sma/smartv3/model/CustomLatLng;->latitude:D

    iget-wide v2, p0, Lcom/sma/smartv3/model/CustomLatLng;->longitude:D

    iget-wide v4, p0, Lcom/sma/smartv3/model/CustomLatLng;->time:J

    iget v6, p0, Lcom/sma/smartv3/model/CustomLatLng;->altitude:I

    iget v7, p0, Lcom/sma/smartv3/model/CustomLatLng;->color:I

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "CustomLatLng(latitude="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", longitude="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", time="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", altitude="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", color="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

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

    iget-wide v0, p0, Lcom/sma/smartv3/model/CustomLatLng;->latitude:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget-wide v0, p0, Lcom/sma/smartv3/model/CustomLatLng;->longitude:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    iget-wide v0, p0, Lcom/sma/smartv3/model/CustomLatLng;->time:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget p2, p0, Lcom/sma/smartv3/model/CustomLatLng;->altitude:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/sma/smartv3/model/CustomLatLng;->color:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
