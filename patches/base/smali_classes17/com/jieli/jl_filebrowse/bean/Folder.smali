.class public Lcom/jieli/jl_filebrowse/bean/Folder;
.super Lcom/jieli/jl_filebrowse/bean/File;
.source "SourceFile"


# instance fields
.field private final transient files:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/File;",
            ">;"
        }
    .end annotation
.end field

.field private isLoadFinish:Z


# direct methods
.method public constructor <init>(Lcom/jieli/jl_filebrowse/bean/Folder;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_filebrowse/bean/File;-><init>(Lcom/jieli/jl_filebrowse/bean/Folder;)V

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_filebrowse/bean/Folder;->files:Ljava/util/List;

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lcom/jieli/jl_filebrowse/bean/Folder;->isLoadFinish:Z

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_filebrowse/bean/Folder;Lcom/jieli/jl_filebrowse/bean/FileStruct;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NullPointerException;
        }
    .end annotation

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_filebrowse/bean/File;-><init>(Lcom/jieli/jl_filebrowse/bean/Folder;Lcom/jieli/jl_filebrowse/bean/FileStruct;)V

    .line 5
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_filebrowse/bean/Folder;->files:Ljava/util/List;

    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lcom/jieli/jl_filebrowse/bean/Folder;->isLoadFinish:Z

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_filebrowse/bean/Folder;ZISLjava/lang/String;B)V
    .locals 8

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move v7, p6

    .line 7
    invoke-direct/range {v0 .. v7}, Lcom/jieli/jl_filebrowse/bean/File;-><init>(Lcom/jieli/jl_filebrowse/bean/Folder;ZZISLjava/lang/String;B)V

    .line 8
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, v0, Lcom/jieli/jl_filebrowse/bean/Folder;->files:Ljava/util/List;

    const/4 p1, 0x0

    .line 9
    iput-boolean p1, v0, Lcom/jieli/jl_filebrowse/bean/Folder;->isLoadFinish:Z

    return-void
.end method

.method public static synthetic iO(Lcom/jieli/jl_filebrowse/bean/File;Lcom/jieli/jl_filebrowse/bean/File;)I
    .locals 0

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getFileNum()S

    move-result p0

    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getFileNum()S

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p0

    return p0
.end method


# virtual methods
.method public addChild(Lcom/jieli/jl_filebrowse/bean/File;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, v0, p1}, Lcom/jieli/jl_filebrowse/bean/Folder;->addChild(Ljava/util/List;Z)V

    return-void
.end method

.method public addChild(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/File;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_filebrowse/bean/Folder;->addChild(Ljava/util/List;Z)V

    return-void
.end method

.method public addChild(Ljava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/File;",
            ">;Z)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    .line 5
    iget-object p2, p0, Lcom/jieli/jl_filebrowse/bean/Folder;->files:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->clear()V

    :cond_0
    if-nez p1, :cond_1

    goto :goto_1

    .line 6
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_filebrowse/bean/File;

    .line 7
    iget-object v1, p0, Lcom/jieli/jl_filebrowse/bean/Folder;->files:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 8
    iget-object p2, p0, Lcom/jieli/jl_filebrowse/bean/Folder;->files:Ljava/util/List;

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p2, 0x1

    goto :goto_0

    :cond_3
    if-eqz p2, :cond_4

    .line 9
    iget-object p1, p0, Lcom/jieli/jl_filebrowse/bean/Folder;->files:Ljava/util/List;

    new-instance p2, Lcom/android/mltcode/paycertificationapi/OO11XIO0O;

    invoke-direct {p2}, Lcom/android/mltcode/paycertificationapi/OO11XIO0O;-><init>()V

    invoke-static {p1, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public clean()V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/bean/Folder;->files:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_filebrowse/bean/File;

    invoke-virtual {v1}, Lcom/jieli/jl_filebrowse/bean/File;->isFolder()Z

    move-result v2

    if-eqz v2, :cond_0

    check-cast v1, Lcom/jieli/jl_filebrowse/bean/Folder;

    invoke-virtual {v1}, Lcom/jieli/jl_filebrowse/bean/Folder;->clean()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_filebrowse/bean/Folder;->files:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_filebrowse/bean/Folder;->setLoadFinished(Z)V

    return-void
.end method

.method public findFolderByName(Ljava/lang/String;)Lcom/jieli/jl_filebrowse/bean/Folder;
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/jieli/jl_filebrowse/bean/Folder;->files:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jieli/jl_filebrowse/bean/File;

    invoke-virtual {v2}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Lcom/jieli/jl_filebrowse/bean/File;->isFolder()Z

    move-result v3

    if-eqz v3, :cond_1

    check-cast v2, Lcom/jieli/jl_filebrowse/bean/Folder;

    return-object v2

    :cond_2
    :goto_0
    return-object v0
.end method

.method public getChildCount()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/bean/Folder;->files:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getChildFile(I)Lcom/jieli/jl_filebrowse/bean/File;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_filebrowse/bean/Folder;->getChildFile(IZ)Lcom/jieli/jl_filebrowse/bean/File;

    move-result-object p1

    return-object p1
.end method

.method public getChildFile(IZ)Lcom/jieli/jl_filebrowse/bean/File;
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_filebrowse/bean/Folder;->files:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_filebrowse/bean/File;

    .line 3
    invoke-virtual {v1}, Lcom/jieli/jl_filebrowse/bean/File;->getFileStruct()Lcom/jieli/jl_filebrowse/bean/FileStruct;

    move-result-object v2

    invoke-virtual {v2}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getCluster()I

    move-result v2

    if-ne v2, p1, :cond_1

    return-object v1

    :cond_1
    if-eqz p2, :cond_0

    .line 4
    invoke-virtual {v1}, Lcom/jieli/jl_filebrowse/bean/File;->isFolder()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    check-cast v1, Lcom/jieli/jl_filebrowse/bean/Folder;

    const/4 v2, 0x1

    .line 6
    invoke-virtual {v1, p1, v2}, Lcom/jieli/jl_filebrowse/bean/Folder;->getChildFile(IZ)Lcom/jieli/jl_filebrowse/bean/File;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public getChildFileStructs()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/FileStruct;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/jieli/jl_filebrowse/bean/Folder;->files:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jieli/jl_filebrowse/bean/File;

    invoke-virtual {v2}, Lcom/jieli/jl_filebrowse/bean/File;->getFileStruct()Lcom/jieli/jl_filebrowse/bean/FileStruct;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public getClusterArray()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getCluster()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/File;->getParent()Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getCluster()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Lcom/jieli/jl_filebrowse/bean/File;->getParent()Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object v1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-static {v0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    return-object v0
.end method

.method public getStartIndex()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/bean/Folder;->files:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public isEndElement(Lcom/jieli/jl_filebrowse/bean/FileStruct;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object v1, p0, Lcom/jieli/jl_filebrowse/bean/Folder;->files:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lcom/jieli/jl_filebrowse/bean/Folder;->isLoadFinish:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/jieli/jl_filebrowse/bean/Folder;->files:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_filebrowse/bean/File;

    invoke-virtual {v1}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getCluster()I

    move-result v1

    invoke-virtual {p1}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getCluster()I

    move-result p1

    if-ne v1, p1, :cond_1

    return v3

    :cond_1
    :goto_0
    return v0
.end method

.method public isLoadFinished(Z)Z
    .locals 0

    iget-boolean p1, p0, Lcom/jieli/jl_filebrowse/bean/Folder;->isLoadFinish:Z

    return p1
.end method

.method public isRootFolder()Z
    .locals 2

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/File;->isFolder()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getCluster()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ROOT"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public removeChild(I)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/bean/Folder;->getChildFile(I)Lcom/jieli/jl_filebrowse/bean/File;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_filebrowse/bean/Folder;->removeChild(Lcom/jieli/jl_filebrowse/bean/File;)Z

    move-result p1

    return p1
.end method

.method public removeChild(Lcom/jieli/jl_filebrowse/bean/File;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_filebrowse/bean/Folder;->files:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public setLoadFinished(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_filebrowse/bean/Folder;->isLoadFinish:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Folder{parent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/File;->getParent()Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",\n level="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/jieli/jl_filebrowse/bean/File;->getLevel()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

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

    const-string v1, "\", isLoadFinish="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_filebrowse/bean/Folder;->isLoadFinish:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
