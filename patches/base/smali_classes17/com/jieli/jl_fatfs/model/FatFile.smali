.class public Lcom/jieli/jl_fatfs/model/FatFile;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private cluster:I

.field private devIndex:B

.field private file:Z

.field private fileNum:S

.field private isDir:Z

.field private modifyTime:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private path:Ljava/lang/String;

.field private size:J

.field private unicode:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/jieli/jl_fatfs/model/FatFile$1;

    invoke-direct {v0}, Lcom/jieli/jl_fatfs/model/FatFile$1;-><init>()V

    sput-object v0, Lcom/jieli/jl_fatfs/model/FatFile;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/jieli/jl_fatfs/model/FatFile;->size:J

    .line 4
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_fatfs/model/FatFile;->name:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/jieli/jl_fatfs/model/FatFile;->isDir:Z

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_fatfs/model/FatFile;->modifyTime:Ljava/lang/String;

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_fatfs/model/FatFile;->path:Ljava/lang/String;

    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_fatfs/model/FatFile;->cluster:I

    .line 9
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v2, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lcom/jieli/jl_fatfs/model/FatFile;->file:Z

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v2, :cond_2

    move v1, v2

    :cond_2
    iput-boolean v1, p0, Lcom/jieli/jl_fatfs/model/FatFile;->unicode:Z

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    int-to-short v0, v0

    iput-short v0, p0, Lcom/jieli/jl_fatfs/model/FatFile;->fileNum:S

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result p1

    iput-byte p1, p0, Lcom/jieli/jl_fatfs/model/FatFile;->devIndex:B

    return-void
.end method

.method public static create(Lcom/jieli/jl_filebrowse/bean/FileStruct;)Lcom/jieli/jl_fatfs/model/FatFile;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lcom/jieli/jl_fatfs/model/FatFile;

    invoke-direct {v0}, Lcom/jieli/jl_fatfs/model/FatFile;-><init>()V

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_fatfs/model/FatFile;->setName(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getCluster()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_fatfs/model/FatFile;->setCluster(I)V

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getDevIndex()B

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_fatfs/model/FatFile;->setDevIndex(B)V

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getFileNum()S

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_fatfs/model/FatFile;->setFileNum(S)V

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->isFile()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_fatfs/model/FatFile;->setFile(Z)V

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->isUnicode()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_fatfs/model/FatFile;->setUnicode(Z)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/jieli/jl_fatfs/model/FatFile;->setPath(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getCluster()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_fatfs/model/FatFile;->cluster:I

    return v0
.end method

.method public getDevIndex()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_fatfs/model/FatFile;->devIndex:B

    return v0
.end method

.method public getFileNum()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_fatfs/model/FatFile;->fileNum:S

    return v0
.end method

.method public getModifyTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_fatfs/model/FatFile;->modifyTime:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_fatfs/model/FatFile;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_fatfs/model/FatFile;->path:Ljava/lang/String;

    return-object v0
.end method

.method public getSize()J
    .locals 2

    iget-wide v0, p0, Lcom/jieli/jl_fatfs/model/FatFile;->size:J

    return-wide v0
.end method

.method public isDir()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_fatfs/model/FatFile;->isDir:Z

    return v0
.end method

.method public isFile()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_fatfs/model/FatFile;->file:Z

    return v0
.end method

.method public isUnicode()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_fatfs/model/FatFile;->unicode:Z

    return v0
.end method

.method public setCluster(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_fatfs/model/FatFile;->cluster:I

    return-void
.end method

.method public setDevIndex(B)V
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_fatfs/model/FatFile;->devIndex:B

    return-void
.end method

.method public setDir(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_fatfs/model/FatFile;->isDir:Z

    return-void
.end method

.method public setFile(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_fatfs/model/FatFile;->file:Z

    return-void
.end method

.method public setFileNum(S)V
    .locals 0

    iput-short p1, p0, Lcom/jieli/jl_fatfs/model/FatFile;->fileNum:S

    return-void
.end method

.method public setModifyTime(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_fatfs/model/FatFile;->modifyTime:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_fatfs/model/FatFile;->name:Ljava/lang/String;

    return-void
.end method

.method public setPath(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_fatfs/model/FatFile;->path:Ljava/lang/String;

    return-void
.end method

.method public setSize(J)V
    .locals 0

    iput-wide p1, p0, Lcom/jieli/jl_fatfs/model/FatFile;->size:J

    return-void
.end method

.method public setUnicode(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_fatfs/model/FatFile;->unicode:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FatFile{size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/jieli/jl_fatfs/model/FatFile;->size:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_fatfs/model/FatFile;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", isDir="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/jieli/jl_fatfs/model/FatFile;->isDir:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", modifyTime=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_fatfs/model/FatFile;->modifyTime:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", path=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_fatfs/model/FatFile;->path:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", file="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_fatfs/model/FatFile;->file:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", unicode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_fatfs/model/FatFile;->unicode:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", cluster="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_fatfs/model/FatFile;->cluster:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", fileNum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/jieli/jl_fatfs/model/FatFile;->fileNum:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", devIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_fatfs/model/FatFile;->devIndex:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget-wide v0, p0, Lcom/jieli/jl_fatfs/model/FatFile;->size:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object p2, p0, Lcom/jieli/jl_fatfs/model/FatFile;->name:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/jieli/jl_fatfs/model/FatFile;->isDir:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-object p2, p0, Lcom/jieli/jl_fatfs/model/FatFile;->modifyTime:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/jieli/jl_fatfs/model/FatFile;->path:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/jieli/jl_fatfs/model/FatFile;->cluster:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/jieli/jl_fatfs/model/FatFile;->file:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/jieli/jl_fatfs/model/FatFile;->unicode:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-short p2, p0, Lcom/jieli/jl_fatfs/model/FatFile;->fileNum:S

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-byte p2, p0, Lcom/jieli/jl_fatfs/model/FatFile;->devIndex:B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    return-void
.end method
