.class public Lcom/jieli/jl_filebrowse/util/DeviceChoseUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String; = "DeviceChoseUtil"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getSdOfUsbDev()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/SDCardBean;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getOnlineDev()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    invoke-virtual {v2}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getType()I

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getType()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    :cond_1
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public static getTargetDev()Lcom/jieli/jl_filebrowse/bean/SDCardBean;
    .locals 5

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getOnlineDev()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/jieli/jl_filebrowse/util/DeviceChoseUtil;->a:Ljava/lang/String;

    const-string v2, "getTargetDev"

    const-string v3, "no online device"

    invoke-static {v0, v2, v3}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_0
    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getOnlineDev()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    invoke-virtual {v3}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getType()I

    move-result v4

    if-nez v4, :cond_1

    return-object v3

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    invoke-virtual {v2}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getType()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_3

    return-object v2

    :cond_4
    return-object v1
.end method

.method public static getTargetDevFlash2First()Lcom/jieli/jl_filebrowse/bean/SDCardBean;
    .locals 4

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getOnlineDev()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/jieli/jl_filebrowse/util/DeviceChoseUtil;->a:Ljava/lang/String;

    const-string v1, "getTargetDevFlash2First"

    const-string v2, "no online device"

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getOnlineDev()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    invoke-virtual {v1}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->getType()I

    move-result v2

    const/4 v3, 0x4

    if-ne v2, v3, :cond_1

    return-object v1

    :cond_2
    invoke-static {}, Lcom/jieli/jl_filebrowse/util/DeviceChoseUtil;->getTargetDev()Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v0

    return-object v0
.end method
