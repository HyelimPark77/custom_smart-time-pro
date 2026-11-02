.class public Lcom/jieli/jl_rcsp/model/device/VoiceData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CHANNEL_MONO:I = 0x1

.field public static final CHANNEL_STEREO:I = 0x2

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/jieli/jl_rcsp/model/device/VoiceData;",
            ">;"
        }
    .end annotation
.end field

.field public static final ENCODING_PCM_16BIT:I = 0x2

.field public static final ENCODING_PCM_8BIT:I = 0x1

.field public static final VOICE_TYPE_OPUS:I = 0x2

.field public static final VOICE_TYPE_PCM:I = 0x0

.field public static final VOICE_TYPE_SPEEX:I = 0x1


# instance fields
.field private channel:I

.field private data:[B

.field private dataType:I

.field private format:I

.field private sampleRate:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/VoiceData$1;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/VoiceData$1;-><init>()V

    sput-object v0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x3e80

    .line 2
    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->sampleRate:I

    const/4 v0, 0x2

    .line 3
    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->format:I

    const/4 v0, 0x1

    .line 4
    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->channel:I

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x3e80

    .line 6
    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->sampleRate:I

    const/4 v0, 0x2

    .line 7
    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->format:I

    const/4 v0, 0x1

    .line 8
    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->channel:I

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->dataType:I

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->data:[B

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->sampleRate:I

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->format:I

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->channel:I

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lcom/jieli/jl_rcsp/model/device/VoiceData;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/jieli/jl_rcsp/model/device/VoiceData;

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->dataType:I

    iget v2, p1, Lcom/jieli/jl_rcsp/model/device/VoiceData;->dataType:I

    if-ne v0, v2, :cond_0

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->sampleRate:I

    iget v2, p1, Lcom/jieli/jl_rcsp/model/device/VoiceData;->sampleRate:I

    if-ne v0, v2, :cond_0

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->format:I

    iget v2, p1, Lcom/jieli/jl_rcsp/model/device/VoiceData;->format:I

    if-ne v0, v2, :cond_0

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->channel:I

    iget p1, p1, Lcom/jieli/jl_rcsp/model/device/VoiceData;->channel:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public getChannel()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->channel:I

    return v0
.end method

.method public getData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->data:[B

    return-object v0
.end method

.method public getDataType()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->dataType:I

    return v0
.end method

.method public getFormat()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->format:I

    return v0
.end method

.method public getSampleRate()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->sampleRate:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->dataType:I

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->sampleRate:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->format:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->channel:I

    add-int/2addr v0, v1

    return v0
.end method

.method public setChannel(I)Lcom/jieli/jl_rcsp/model/device/VoiceData;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->channel:I

    return-object p0
.end method

.method public setData([B)Lcom/jieli/jl_rcsp/model/device/VoiceData;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->data:[B

    return-object p0
.end method

.method public setDataType(I)Lcom/jieli/jl_rcsp/model/device/VoiceData;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->dataType:I

    return-object p0
.end method

.method public setFormat(I)Lcom/jieli/jl_rcsp/model/device/VoiceData;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->format:I

    return-object p0
.end method

.method public setSampleRate(I)Lcom/jieli/jl_rcsp/model/device/VoiceData;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->sampleRate:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VoiceData{dataType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->dataType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->data:[B

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sampleRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->sampleRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", format="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->format:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", channel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->channel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->dataType:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->data:[B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->sampleRate:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->format:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/VoiceData;->channel:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
