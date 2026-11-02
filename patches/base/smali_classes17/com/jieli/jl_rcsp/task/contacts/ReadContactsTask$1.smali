.class Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/task/TaskListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;->start()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBegin()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;->a(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;)V

    return-void
.end method

.method public onCancel(I)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;->b(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;I)V

    return-void
.end method

.method public onError(ILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;

    invoke-static {v0, p1, p2}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;->a(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;ILjava/lang/String;)V

    return-void
.end method

.method public onFinish()V
    .locals 6

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;->b(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;)Lcom/jieli/jl_rcsp/task/ITask;

    move-result-object v0

    instance-of v0, v0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;->b(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;)Lcom/jieli/jl_rcsp/task/ITask;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;->getContacts()Ljava/util/List;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;->a(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;Ljava/util/List;)Ljava/util/List;

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;

    invoke-static {v2}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;->c(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v1}, Ljava/io/FileInputStream;->available()I

    move-result v0

    new-array v0, v0, [B

    invoke-virtual {v1, v0}, Ljava/io/FileInputStream;->read([B)I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    new-array v4, v2, [B

    invoke-static {v0, v3, v4, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;

    invoke-static {v3, v4}, Lcom/jieli/jl_rcsp/task/contacts/DeviceContacts;->fromData(S[B)Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;->a(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;Ljava/util/List;)Ljava/util/List;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_3

    :catch_1
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v1

    move-object v5, v1

    move-object v1, v0

    move-object v0, v5

    goto :goto_3

    :catch_2
    move-exception v1

    move-object v5, v1

    move-object v1, v0

    move-object v0, v5

    :goto_0
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v1, :cond_1

    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_2

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;->d(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;)V

    return-void

    :goto_3
    if-eqz v1, :cond_2

    :try_start_5
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_4

    :catch_3
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    :goto_4
    throw v0
.end method

.method public onProgress(I)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;->a(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsTask;I)V

    return-void
.end method
