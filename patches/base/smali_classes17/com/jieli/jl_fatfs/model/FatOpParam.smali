.class public Lcom/jieli/jl_fatfs/model/FatOpParam;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final FAT_OP_CREATE_FILE:I = 0x2

.field public static final FAT_OP_DELETE_FILE:I = 0x3

.field public static final FAT_OP_RECOVERY_SYS:I = 0xff

.field public static final FAT_OP_REPLACE_FILE:I = 0x4


# instance fields
.field private filePath:Ljava/lang/String;

.field private mProgressListener:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

.field private op:I

.field private sumFileDataLen:I

.field private totalSize:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/jieli/jl_fatfs/model/FatOpParam;->sumFileDataLen:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/jieli/jl_fatfs/model/FatOpParam;->totalSize:J

    return-void
.end method


# virtual methods
.method public getFilePath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_fatfs/model/FatOpParam;->filePath:Ljava/lang/String;

    return-object v0
.end method

.method public getOp()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_fatfs/model/FatOpParam;->op:I

    return v0
.end method

.method public getProgressListener()Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_fatfs/model/FatOpParam;->mProgressListener:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    return-object v0
.end method

.method public getSumFileDataLen()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_fatfs/model/FatOpParam;->sumFileDataLen:I

    return v0
.end method

.method public getTotalSize()J
    .locals 2

    iget-wide v0, p0, Lcom/jieli/jl_fatfs/model/FatOpParam;->totalSize:J

    return-wide v0
.end method

.method public setFilePath(Ljava/lang/String;)Lcom/jieli/jl_fatfs/model/FatOpParam;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_fatfs/model/FatOpParam;->filePath:Ljava/lang/String;

    return-object p0
.end method

.method public setOp(I)Lcom/jieli/jl_fatfs/model/FatOpParam;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_fatfs/model/FatOpParam;->op:I

    return-object p0
.end method

.method public setProgressListener(Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)Lcom/jieli/jl_fatfs/model/FatOpParam;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_fatfs/model/FatOpParam;->mProgressListener:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    return-object p0
.end method

.method public setSumFileDataLen(I)Lcom/jieli/jl_fatfs/model/FatOpParam;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_fatfs/model/FatOpParam;->sumFileDataLen:I

    return-object p0
.end method

.method public setTotalSize(J)Lcom/jieli/jl_fatfs/model/FatOpParam;
    .locals 0

    iput-wide p1, p0, Lcom/jieli/jl_fatfs/model/FatOpParam;->totalSize:J

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FatOpParam{op="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_fatfs/model/FatOpParam;->op:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", filePath=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_fatfs/model/FatOpParam;->filePath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", sumFileDataLen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_fatfs/model/FatOpParam;->sumFileDataLen:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", totalSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/jieli/jl_fatfs/model/FatOpParam;->totalSize:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mProgressListener="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_fatfs/model/FatOpParam;->mProgressListener:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
