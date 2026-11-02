.class public abstract Lcom/jieli/jl_filebrowse/bean/File;
.super Lcom/jieli/jl_filebrowse/bean/FileStruct;
.source "SourceFile"


# static fields
.field public static final ROOT_DIR_NAME:Ljava/lang/String; = "ROOT"


# instance fields
.field private final level:I

.field private final transient parent:Lcom/jieli/jl_filebrowse/bean/Folder;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_filebrowse/bean/Folder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/jieli/jl_filebrowse/bean/File;->parent:Lcom/jieli/jl_filebrowse/bean/Folder;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/File;->getLevel()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    :goto_0
    iput p1, p0, Lcom/jieli/jl_filebrowse/bean/File;->level:I

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_filebrowse/bean/Folder;Lcom/jieli/jl_filebrowse/bean/FileStruct;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NullPointerException;
        }
    .end annotation

    .line 4
    invoke-virtual {p2}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->isFile()Z

    move-result v2

    invoke-virtual {p2}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->isUnicode()Z

    move-result v3

    invoke-virtual {p2}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getCluster()I

    move-result v4

    .line 5
    invoke-virtual {p2}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getFileNum()S

    move-result v5

    invoke-virtual {p2}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getDevIndex()B

    move-result v7

    move-object v0, p0

    move-object v1, p1

    .line 6
    invoke-direct/range {v0 .. v7}, Lcom/jieli/jl_filebrowse/bean/File;-><init>(Lcom/jieli/jl_filebrowse/bean/Folder;ZZISLjava/lang/String;B)V

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_filebrowse/bean/Folder;ZZISLjava/lang/String;B)V
    .locals 7

    move-object v0, p0

    move v1, p2

    move v2, p3

    move v3, p4

    move v4, p5

    move-object v5, p6

    move v6, p7

    .line 7
    invoke-direct/range {v0 .. v6}, Lcom/jieli/jl_filebrowse/bean/FileStruct;-><init>(ZZISLjava/lang/String;B)V

    .line 8
    iput-object p1, v0, Lcom/jieli/jl_filebrowse/bean/File;->parent:Lcom/jieli/jl_filebrowse/bean/Folder;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/File;->getLevel()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    :goto_0
    iput p1, v0, Lcom/jieli/jl_filebrowse/bean/File;->level:I

    return-void
.end method

.method public static createRootFolder(I)Lcom/jieli/jl_filebrowse/bean/Folder;
    .locals 7

    new-instance v0, Lcom/jieli/jl_filebrowse/bean/Folder;

    int-to-byte v6, p0

    const/4 v4, 0x1

    const-string v5, "ROOT"

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/jieli/jl_filebrowse/bean/Folder;-><init>(Lcom/jieli/jl_filebrowse/bean/Folder;ZISLjava/lang/String;B)V

    return-object v0
.end method


# virtual methods
.method public convertPathData(Lcom/jieli/jl_filebrowse/bean/SDCardBean;SI)Lcom/jieli/jl_filebrowse/bean/PathData;
    .locals 6

    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getIndex()I

    move-result v0

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getDevIndex()B

    move-result v1

    if-eq v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Lcom/jieli/jl_filebrowse/bean/PathData;

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->isFile()Z

    move-result v1

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v1

    invoke-static {p3}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v2

    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getDevHandler()I

    move-result v4

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/File;->getClusterArray()Ljava/util/List;

    move-result-object v5

    move v3, p2

    invoke-direct/range {v0 .. v5}, Lcom/jieli/jl_filebrowse/bean/PathData;-><init>(BBSILjava/util/List;)V

    return-object v0
.end method

.method public abstract getClusterArray()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public getFileStruct()Lcom/jieli/jl_filebrowse/bean/FileStruct;
    .locals 7

    new-instance v0, Lcom/jieli/jl_filebrowse/bean/FileStruct;

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->isFile()Z

    move-result v1

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->isUnicode()Z

    move-result v2

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getCluster()I

    move-result v3

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getFileNum()S

    move-result v4

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getDevIndex()B

    move-result v6

    invoke-direct/range {v0 .. v6}, Lcom/jieli/jl_filebrowse/bean/FileStruct;-><init>(ZZISLjava/lang/String;B)V

    return-object v0
.end method

.method public getLevel()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_filebrowse/bean/File;->level:I

    return v0
.end method

.method public getParent()Lcom/jieli/jl_filebrowse/bean/Folder;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/bean/File;->parent:Lcom/jieli/jl_filebrowse/bean/Folder;

    return-object v0
.end method

.method public getPathData()[B
    .locals 4

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/File;->getClusterArray()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-ltz v2, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public getPathString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/bean/File;->parent:Lcom/jieli/jl_filebrowse/bean/Folder;

    const-string v1, "/"

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/jieli/jl_filebrowse/bean/File;->parent:Lcom/jieli/jl_filebrowse/bean/Folder;

    invoke-virtual {v2}, Lcom/jieli/jl_filebrowse/bean/File;->getPathString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isFolder()Z
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->isFile()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "File{parent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_filebrowse/bean/File;->parent:Lcom/jieli/jl_filebrowse/bean/Folder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",\n level="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_filebrowse/bean/File;->level:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isFile="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->isFile()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isUnicode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->isUnicode()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", cluster="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getCluster()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", devIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getDevIndex()B

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", fileNum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getFileNum()S

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", name=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\", path=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/File;->getPathString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
