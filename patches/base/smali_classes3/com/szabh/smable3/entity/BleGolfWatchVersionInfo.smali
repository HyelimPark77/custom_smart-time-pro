.class public final Lcom/szabh/smable3/entity/BleGolfWatchVersionInfo;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleGolfWatchVersionInfo$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleGolfWatchVersionInfo$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_HEADER_LENGTH:I = 0x12


# instance fields
.field private mCourseId:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mVersion:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleGolfWatchVersionInfo$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleGolfWatchVersionInfo$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleGolfWatchVersionInfo;->Companion:Lcom/szabh/smable3/entity/BleGolfWatchVersionInfo$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchVersionInfo;->mCourseId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public decode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/16 v2, 0x10

    invoke-static {p0, v2, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readString$default(Lcom/bestmafen/baseble/data/BleReadable;ILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchVersionInfo;->mCourseId:Ljava/lang/String;

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchVersionInfo;->mVersion:I

    return-void
.end method

.method public encode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchVersionInfo;->mCourseId:Ljava/lang/String;

    const/16 v1, 0x10

    sget-object v2, Lkotlin/text/Charsets;->IiI10X:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0, v1, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeStringWithFix(Ljava/lang/String;ILjava/nio/charset/Charset;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchVersionInfo;->mVersion:I

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v2, "LITTLE_ENDIAN"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    return-void
.end method

.method public final getMCourseId()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchVersionInfo;->mCourseId:Ljava/lang/String;

    return-object v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x12

    return v0
.end method

.method public final getMVersion()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchVersionInfo;->mVersion:I

    return v0
.end method

.method public final setMCourseId(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleGolfWatchVersionInfo;->mCourseId:Ljava/lang/String;

    return-void
.end method

.method public final setMVersion(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGolfWatchVersionInfo;->mVersion:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\n            BleGolfWatchVersionInfo(mCourseId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleGolfWatchVersionInfo;->mCourseId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",mVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGolfWatchVersionInfo;->mVersion:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")\n        "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/he5;->OiIIX101O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
