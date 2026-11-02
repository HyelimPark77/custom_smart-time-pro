.class public final Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleGirlCareSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleGirlCareSettings.kt\ncom/szabh/smable3/entity/BleGirlCareMenstruationDate\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,82:1\n222#2,4:83\n*S KotlinDebug\n*F\n+ 1 BleGirlCareSettings.kt\ncom/szabh/smable3/entity/BleGirlCareMenstruationDate\n*L\n21#1:83,4\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleGirlCareSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleGirlCareSettings.kt\ncom/szabh/smable3/entity/BleGirlCareMenstruationDate\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,82:1\n222#2,4:83\n*S KotlinDebug\n*F\n+ 1 BleGirlCareSettings.kt\ncom/szabh/smable3/entity/BleGirlCareMenstruationDate\n*L\n21#1:83,4\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x7


# instance fields
.field private mTime:Lcom/szabh/smable3/entity/BleTime;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mType:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;->Companion:Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1, v0}, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;-><init>(ILcom/szabh/smable3/entity/BleTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILcom/szabh/smable3/entity/BleTime;)V
    .locals 1
    .param p2    # Lcom/szabh/smable3/entity/BleTime;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mTime"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;->mType:I

    .line 4
    iput-object p2, p0, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;->mTime:Lcom/szabh/smable3/entity/BleTime;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/szabh/smable3/entity/BleTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 5
    new-instance v0, Lcom/szabh/smable3/entity/BleTime;

    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/szabh/smable3/entity/BleTime;-><init>(IIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p2, v0

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;-><init>(ILcom/szabh/smable3/entity/BleTime;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;ILcom/szabh/smable3/entity/BleTime;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;->mType:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;->mTime:Lcom/szabh/smable3/entity/BleTime;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;->copy(ILcom/szabh/smable3/entity/BleTime;)Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;->mType:I

    return v0
.end method

.method public final component2()Lcom/szabh/smable3/entity/BleTime;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;->mTime:Lcom/szabh/smable3/entity/BleTime;

    return-object v0
.end method

.method public final copy(ILcom/szabh/smable3/entity/BleTime;)Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;
    .locals 1
    .param p2    # Lcom/szabh/smable3/entity/BleTime;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mTime"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;

    invoke-direct {v0, p1, p2}, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;-><init>(ILcom/szabh/smable3/entity/BleTime;)V

    return-object v0
.end method

.method public decode()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;->mType:I

    const-class v0, Lcom/szabh/smable3/entity/BleTime;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/data/BleReadable;

    const/4 v1, 0x6

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/szabh/smable3/entity/BleTime;

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;->mTime:Lcom/szabh/smable3/entity/BleTime;

    return-void
.end method

.method public encode()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;->mType:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;->mTime:Lcom/szabh/smable3/entity/BleTime;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    return-void
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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;->mType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;->mType:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;->mTime:Lcom/szabh/smable3/entity/BleTime;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;->mTime:Lcom/szabh/smable3/entity/BleTime;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/4 v0, 0x7

    return v0
.end method

.method public final getMTime()Lcom/szabh/smable3/entity/BleTime;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;->mTime:Lcom/szabh/smable3/entity/BleTime;

    return-object v0
.end method

.method public final getMType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;->mType:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;->mType:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;->mTime:Lcom/szabh/smable3/entity/BleTime;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleTime;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMTime(Lcom/szabh/smable3/entity/BleTime;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleTime;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;->mTime:Lcom/szabh/smable3/entity/BleTime;

    return-void
.end method

.method public final setMType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;->mType:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleGirlCareMenstruationDate(mType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;->mType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleGirlCareMenstruationDate;->mTime:Lcom/szabh/smable3/entity/BleTime;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
