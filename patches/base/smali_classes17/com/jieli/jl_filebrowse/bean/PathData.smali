.class public Lcom/jieli/jl_filebrowse/bean/PathData;
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
            "Lcom/jieli/jl_filebrowse/bean/PathData;",
            ">;"
        }
    .end annotation
.end field

.field public static final PATH_TYPE_FILE:B = 0x1t

.field public static final PATH_TYPE_FlODER:B


# instance fields
.field private devHandler:I

.field private final path:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private readNum:B

.field private repeatTimes:I

.field private startIndex:S

.field private type:B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/jieli/jl_filebrowse/bean/PathData$1;

    invoke-direct {v0}, Lcom/jieli/jl_filebrowse/bean/PathData$1;-><init>()V

    sput-object v0, Lcom/jieli/jl_filebrowse/bean/PathData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->type:B

    const/16 v1, 0xa

    .line 3
    iput-byte v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->readNum:B

    const/4 v1, 0x1

    .line 4
    iput-short v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->startIndex:S

    .line 5
    iput v0, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->devHandler:I

    const/4 v1, 0x3

    .line 6
    iput v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->repeatTimes:I

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->path:Ljava/util/List;

    .line 8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>(BBSILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(BBSI",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    .line 10
    iput v0, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->repeatTimes:I

    .line 11
    iput-byte p1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->type:B

    .line 12
    iput-byte p2, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->readNum:B

    .line 13
    iput-short p3, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->startIndex:S

    .line 14
    iput p4, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->devHandler:I

    .line 15
    iput-object p5, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->path:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 4

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 17
    iput-byte v0, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->type:B

    const/16 v1, 0xa

    .line 18
    iput-byte v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->readNum:B

    const/4 v1, 0x1

    .line 19
    iput-short v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->startIndex:S

    .line 20
    iput v0, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->devHandler:I

    const/4 v1, 0x3

    .line 21
    iput v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->repeatTimes:I

    .line 22
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v1

    iput-byte v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->type:B

    .line 23
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v1

    iput-byte v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->readNum:B

    .line 24
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    int-to-short v1, v1

    iput-short v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->startIndex:S

    .line 25
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->devHandler:I

    .line 26
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->repeatTimes:I

    .line 27
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object p1

    if-nez p1, :cond_0

    .line 28
    new-array p1, v0, [I

    .line 29
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->path:Ljava/util/List;

    .line 30
    array-length v1, p1

    :goto_0
    if-ge v0, v1, :cond_1

    aget v2, p1, v0

    .line 31
    iget-object v3, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->path:Ljava/util/List;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getDevHandler()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->devHandler:I

    return v0
.end method

.method public getPath()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->path:Ljava/util/List;

    return-object v0
.end method

.method public getReadNum()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->readNum:B

    return v0
.end method

.method public getRepeatTimes()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->repeatTimes:I

    return v0
.end method

.method public getStartIndex()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->startIndex:S

    return v0
.end method

.method public getType()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->type:B

    return v0
.end method

.method public parse([B)I
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    array-length v1, p1

    const/16 v2, 0xa

    if-ge v1, v2, :cond_0

    goto :goto_1

    :cond_0
    aget-byte v1, p1, v0

    iput-byte v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->type:B

    const/4 v1, 0x1

    aget-byte v1, p1, v1

    iput-byte v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->readNum:B

    const/4 v1, 0x2

    invoke-static {p1, v1, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v3

    int-to-short v3, v3

    iput-short v3, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->startIndex:S

    const/4 v3, 0x4

    invoke-static {p1, v3, v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v4

    iput v4, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->devHandler:I

    const/16 v4, 0x8

    invoke-static {p1, v4, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v1

    iget-object v4, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->path:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->clear()V

    if-lez v1, :cond_2

    add-int/lit8 v4, v1, 0xa

    array-length v5, p1

    if-gt v4, v5, :cond_2

    new-array v5, v1, [B

    invoke-static {p1, v2, v5, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_0
    add-int/lit8 p1, v0, 0x4

    if-gt p1, v1, :cond_1

    iget-object v2, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->path:Ljava/util/List;

    invoke-static {v5, v0, v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v0, p1

    goto :goto_0

    :cond_1
    return v4

    :cond_2
    return v2

    :cond_3
    :goto_1
    return v0
.end method

.method public setRepeatTimes(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->repeatTimes:I

    return-void
.end method

.method public toData()[B
    .locals 4

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    iget-byte v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->type:B

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-byte v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->readNum:B

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-short v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->startIndex:S

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->shortToBigBytes(S)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->devHandler:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iget-object v2, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->path:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/OutputStream;->write([B)V

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    array-length v2, v1

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/OutputStream;->write([B)V

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

    const-string v1, "PathData{type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->type:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", readNum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->readNum:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", startIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->startIndex:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", devHandler="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->devHandler:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", path="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->path:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", repeatTimes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->repeatTimes:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget-byte p2, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->type:B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-byte p2, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->readNum:B

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-short p2, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->startIndex:S

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->devHandler:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->repeatTimes:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->path:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    new-array p2, p2, [I

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->path:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/jieli/jl_filebrowse/bean/PathData;->path:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aput v1, p2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    return-void
.end method
