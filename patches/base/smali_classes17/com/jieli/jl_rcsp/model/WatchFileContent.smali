.class public Lcom/jieli/jl_rcsp/model/WatchFileContent;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final crc:S

.field private final fileSize:J


# direct methods
.method public constructor <init>(JS)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/jieli/jl_rcsp/model/WatchFileContent;->fileSize:J

    iput-short p3, p0, Lcom/jieli/jl_rcsp/model/WatchFileContent;->crc:S

    return-void
.end method


# virtual methods
.method public getCrc()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_rcsp/model/WatchFileContent;->crc:S

    return v0
.end method

.method public getFileSize()J
    .locals 2

    iget-wide v0, p0, Lcom/jieli/jl_rcsp/model/WatchFileContent;->fileSize:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WatchFileContent{fileSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/jieli/jl_rcsp/model/WatchFileContent;->fileSize:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", crc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/jieli/jl_rcsp/model/WatchFileContent;->crc:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
