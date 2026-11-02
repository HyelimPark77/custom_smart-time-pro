.class public Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private album:Ljava/lang/String;

.field private artist:Ljava/lang/String;

.field private currentTime:I

.field private genre:Ljava/lang/String;

.field private number:I

.field private playStatus:Z

.field private title:Ljava/lang/String;

.field private total:I

.field private totalTime:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo$1;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo$1;-><init>()V

    sput-object v0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->number:I

    .line 3
    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->currentTime:I

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->number:I

    .line 6
    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->currentTime:I

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->title:Ljava/lang/String;

    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->artist:Ljava/lang/String;

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->album:Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->number:I

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->total:I

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->totalTime:I

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->genre:Ljava/lang/String;

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->currentTime:I

    .line 15
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->playStatus:Z

    return-void
.end method

.method public static cloneMySelf(Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;)Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;-><init>()V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->getTotal()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->setTotal(I)V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->getCurrentTime()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->setCurrentTime(I)V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->isPlayStatus()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->setPlayStatus(Z)V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->getAlbum()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->setAlbum(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->getArtist()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->setArtist(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->setTitle(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->getGenre()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->setGenre(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->getNumber()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->setNumber(I)V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->getTotalTime()I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->setTotalTime(I)V

    return-object v0
.end method


# virtual methods
.method public clone()Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 2
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->clone()Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;

    move-result-object v0

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getAlbum()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->album:Ljava/lang/String;

    return-object v0
.end method

.method public getArtist()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->artist:Ljava/lang/String;

    return-object v0
.end method

.method public getCurrentTime()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->currentTime:I

    return v0
.end method

.method public getGenre()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->genre:Ljava/lang/String;

    return-object v0
.end method

.method public getNumber()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->number:I

    return v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getTotal()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->total:I

    return v0
.end method

.method public getTotalTime()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->totalTime:I

    return v0
.end method

.method public isPlayStatus()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->playStatus:Z

    return v0
.end method

.method public setAlbum(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->album:Ljava/lang/String;

    return-void
.end method

.method public setArtist(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->artist:Ljava/lang/String;

    return-void
.end method

.method public setCurrentTime(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->currentTime:I

    return-void
.end method

.method public setGenre(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->genre:Ljava/lang/String;

    return-void
.end method

.method public setNumber(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->number:I

    return-void
.end method

.method public setPlayStatus(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->playStatus:Z

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->title:Ljava/lang/String;

    return-void
.end method

.method public setTotal(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->total:I

    return-void
.end method

.method public setTotalTime(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->totalTime:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ID3MusicInfo{title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", artist=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->artist:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", album="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->album:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", number="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->number:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", total="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->total:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", totalTime="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->totalTime:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", genre=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->genre:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", currentTime=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->currentTime:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", playStatus=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->playStatus:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-object p2, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->title:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->artist:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->album:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->number:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->total:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->totalTime:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->genre:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->currentTime:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;->playStatus:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    return-void
.end method
