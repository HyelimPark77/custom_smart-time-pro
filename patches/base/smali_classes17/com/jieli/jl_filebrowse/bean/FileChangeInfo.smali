.class public Lcom/jieli/jl_filebrowse/bean/FileChangeInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final cluster:I

.field private final devHandle:I

.field private final filePath:Ljava/lang/String;

.field private final op:I


# direct methods
.method public constructor <init>(IIILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/jieli/jl_filebrowse/bean/FileChangeInfo;->devHandle:I

    iput p2, p0, Lcom/jieli/jl_filebrowse/bean/FileChangeInfo;->op:I

    iput p3, p0, Lcom/jieli/jl_filebrowse/bean/FileChangeInfo;->cluster:I

    iput-object p4, p0, Lcom/jieli/jl_filebrowse/bean/FileChangeInfo;->filePath:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getCluster()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_filebrowse/bean/FileChangeInfo;->cluster:I

    return v0
.end method

.method public final getDevHandle()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_filebrowse/bean/FileChangeInfo;->devHandle:I

    return v0
.end method

.method public getFilePath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/bean/FileChangeInfo;->filePath:Ljava/lang/String;

    return-object v0
.end method

.method public getOp()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_filebrowse/bean/FileChangeInfo;->op:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FileChangeInfo{devHandle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_filebrowse/bean/FileChangeInfo;->devHandle:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", op="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_filebrowse/bean/FileChangeInfo;->op:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", cluster="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_filebrowse/bean/FileChangeInfo;->cluster:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", filePath=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_filebrowse/bean/FileChangeInfo;->filePath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
