.class public final Lcom/sma/smartv3/ui/device/MusicManagerActivity$O00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_filebrowse/interfaces/FileObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/MusicManagerActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMusicManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicManagerActivity.kt\ncom/sma/smartv3/ui/device/MusicManagerActivity$mFileObserver$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,670:1\n774#2:671\n865#2,2:672\n1#3:674\n*S KotlinDebug\n*F\n+ 1 MusicManagerActivity.kt\ncom/sma/smartv3/ui/device/MusicManagerActivity$mFileObserver$1\n*L\n207#1:671\n207#1:672,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMusicManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicManagerActivity.kt\ncom/sma/smartv3/ui/device/MusicManagerActivity$mFileObserver$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,670:1\n774#2:671\n865#2,2:672\n1#3:674\n*S KotlinDebug\n*F\n+ 1 MusicManagerActivity.kt\ncom/sma/smartv3/ui/device/MusicManagerActivity$mFileObserver$1\n*L\n207#1:671\n207#1:672,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OnFlayCallback(Z)V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTAG()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> OnFlayCallback "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public onFileReadFailed(I)V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTAG()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> onFileReadFailed "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public onFileReadStart()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTAG()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> onFileReadStart"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public onFileReadStop(Z)V
    .locals 5

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getMSDCardBean()Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getCurrentReadFile(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)Lcom/jieli/jl_filebrowse/bean/Folder;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTAG()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " -> onFileReadStop "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getMSDCardBean()Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->access$loadMore(Lcom/sma/smartv3/ui/device/MusicManagerActivity;Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "music"

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/oe5;->OX0X1O10X(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_1

    :try_start_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->access$showList(Lcom/sma/smartv3/ui/device/MusicManagerActivity;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    return-void
.end method

.method public onFileReceiver(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/FileStruct;",
            ">;)V"
        }
    .end annotation

    const-string v0, "fileStructs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTAG()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> onFileReceiver size:"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getMFiles()Ljava/util/List;

    move-result-object v0

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/jieli/jl_filebrowse/bean/FileStruct;

    invoke-virtual {v3}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "getName(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, ".tmp"

    const/4 v7, 0x1

    invoke-static {v4, v6, v7}, Lkotlin/text/StringsKt__StringsKt;->iOiXX(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v3}, Lcom/jieli/jl_filebrowse/bean/FileStruct;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, ".txt"

    invoke-static {v3, v4, v7}, Lkotlin/text/StringsKt__StringsKt;->iOiXX(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public onSdCardStatusChange(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/SDCardBean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTAG()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> onSdCardStatusChange "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    invoke-virtual {v2}, Lcom/jieli/jl_filebrowse/bean/SDCardBean;->isOnline()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->setMSDCardBean(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getMFiles()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getMSDCardBean()Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->access$getCurrentInfo(Lcom/sma/smartv3/ui/device/MusicManagerActivity;Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V

    return-void
.end method
