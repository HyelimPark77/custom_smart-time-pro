.class public Lcom/jieli/jl_filebrowse/bean/FileStruct;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/cmd/IDataOp;
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/jieli/jl_filebrowse/bean/FileStruct;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private cluster:I

.field private devIndex:B

.field private file:Z

.field private fileNum:S

.field private name:Ljava/lang/String;

.field private unicode:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/jieli/jl_filebrowse/bean/FileStruct$1;

    invoke-direct {v0}, Lcom/jieli/jl_filebrowse/bean/FileStruct$1;-><init>()V

    sput-object v0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->cluster:I

    const/4 v0, 0x1

    .line 3
    iput-short v0, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->fileNum:S

    .line 4
    const-string v0, ""

    iput-object v0, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->name:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 13
    iput v0, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->cluster:I

    const/4 v1, 0x1

    .line 14
    iput-short v1, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->fileNum:S

    .line 15
    const-string v2, ""

    iput-object v2, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->name:Ljava/lang/String;

    .line 16
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v2

    if-eqz v2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    iput-boolean v2, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->file:Z

    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v2

    if-eqz v2, :cond_1

    move v0, v1

    :cond_1
    iput-boolean v0, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->unicode:Z

    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->cluster:I

    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    int-to-short v0, v0

    iput-short v0, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->fileNum:S

    .line 20
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->name:Ljava/lang/String;

    .line 21
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result p1

    iput-byte p1, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->devIndex:B

    return-void
.end method

.method public constructor <init>(ZZISLjava/lang/String;B)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-boolean p1, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->file:Z

    .line 7
    iput-boolean p2, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->unicode:Z

    .line 8
    iput p3, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->cluster:I

    .line 9
    iput-short p4, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->fileNum:S

    .line 10
    iput-object p5, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->name:Ljava/lang/String;

    .line 11
    iput-byte p6, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->devIndex:B

    return-void
.end method

.method public static parseFileStruct([BILjava/util/List;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BI",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/FileStruct;",
            ">;)I"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    array-length v1, p0

    sub-int/2addr v1, p1

    const/16 v2, 0x8

    if-lt v1, v2, :cond_3

    if-nez p2, :cond_0

    goto :goto_2

    :cond_0
    :goto_0
    array-length v1, p0

    if-ge p1, v1, :cond_2

    array-length v1, p0

    sub-int/2addr v1, p1

    new-array v2, v1, [B

    invoke-static {p0, p1, v2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v1, Lcom/jieli/jl_filebrowse/bean/FileStruct;

    invoke-direct {v1}, Lcom/jieli/jl_filebrowse/bean/FileStruct;-><init>()V

    invoke-virtual {v1, v2}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->parse([B)I

    move-result v2

    if-gtz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr p1, v2

    goto :goto_0

    :cond_2
    :goto_1
    return p1

    :cond_3
    :goto_2
    return v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/jieli/jl_filebrowse/bean/FileStruct;

    iget-boolean v2, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->file:Z

    iget-boolean v3, p1, Lcom/jieli/jl_filebrowse/bean/FileStruct;->file:Z

    if-ne v2, v3, :cond_2

    iget v2, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->cluster:I

    iget v3, p1, Lcom/jieli/jl_filebrowse/bean/FileStruct;->cluster:I

    if-ne v2, v3, :cond_2

    iget-byte v2, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->devIndex:B

    iget-byte p1, p1, Lcom/jieli/jl_filebrowse/bean/FileStruct;->devIndex:B

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public getCluster()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->cluster:I

    return v0
.end method

.method public getDevIndex()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->devIndex:B

    return v0
.end method

.method public getFileNum()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->fileNum:S

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->name:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->file:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget v1, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->cluster:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-byte v2, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->devIndex:B

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public isFile()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->file:Z

    return v0
.end method

.method public isUnicode()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->unicode:Z

    return v0
.end method

.method public parse([B)I
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    array-length v1, p1

    const/16 v2, 0x8

    if-ge v1, v2, :cond_0

    goto :goto_2

    :cond_0
    aget-byte v1, p1, v0

    invoke-static {v1, v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->checkBitValue(BI)Z

    move-result v0

    iput-boolean v0, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->file:Z

    const/4 v0, 0x1

    invoke-static {v1, v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->checkBitValue(BI)Z

    move-result v3

    xor-int/2addr v3, v0

    iput-boolean v3, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->unicode:Z

    and-int/lit8 v1, v1, 0x7c

    const/4 v3, 0x2

    shr-int/2addr v1, v3

    int-to-byte v1, v1

    iput-byte v1, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->devIndex:B

    const/4 v1, 0x4

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->cluster:I

    const/4 v0, 0x5

    invoke-static {p1, v0, v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v0

    int-to-short v0, v0

    iput-short v0, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->fileNum:S

    const/4 v0, 0x7

    aget-byte v0, p1, v0

    add-int/lit8 v1, v0, 0x8

    array-length v3, p1

    if-gt v1, v3, :cond_2

    :try_start_0
    new-instance v3, Ljava/lang/String;

    iget-boolean v4, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->unicode:Z

    if-eqz v4, :cond_1

    const-string v4, "utf-16le"

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    const-string v4, "gbk"

    :goto_0
    invoke-direct {v3, p1, v2, v0, v4}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    iput-object v3, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->name:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    return v2

    :cond_3
    :goto_2
    return v0
.end method

.method public toData()[B
    .locals 4

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    iget-boolean v1, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->file:Z

    const/4 v2, 0x0

    invoke-static {v2, v2, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    iget-boolean v2, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->unicode:Z

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->setBitValue(BIZ)B

    move-result v1

    iget-byte v2, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->devIndex:B

    shl-int/lit8 v2, v2, 0x2

    or-int/2addr v1, v2

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget v1, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->cluster:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget-short v1, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->fileNum:S

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget-object v1, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->name:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->unicode:Z

    if-eqz v2, :cond_0

    const-string v2, "utf-16le"

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_1

    :cond_0
    const-string v2, "gbk"

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    array-length v2, v1

    invoke-virtual {v0, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_2
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FileStruct{file="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->file:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", unicode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->unicode:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", cluster="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->cluster:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", fileNum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->fileNum:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", devIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->devIndex:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-boolean p2, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->file:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-boolean p2, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->unicode:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget p2, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->cluster:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-short p2, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->fileNum:S

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->name:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-byte p2, p0, Lcom/jieli/jl_filebrowse/bean/FileStruct;->devIndex:B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    return-void
.end method
