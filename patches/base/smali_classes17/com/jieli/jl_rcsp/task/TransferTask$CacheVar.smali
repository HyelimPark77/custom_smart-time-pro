.class Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/task/TransferTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CacheVar"
.end annotation


# static fields
.field public static final l:I = 0x32


# instance fields
.field public a:Ljava/io/RandomAccessFile;

.field public b:S

.field public c:I

.field public d:J

.field public e:I

.field public f:I

.field public final g:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Lcom/jieli/jl_rcsp/task/TransferTask$SendData;",
            ">;"
        }
    .end annotation
.end field

.field public h:Z

.field public i:J

.field public j:J

.field public k:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->f:I

    .line 3
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->g:Ljava/util/concurrent/LinkedBlockingQueue;

    const-wide/16 v0, -0x1

    .line 4
    iput-wide v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->j:J

    const-wide/16 v0, 0x32

    .line 5
    iput-wide v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->k:J

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jieli/jl_rcsp/task/TransferTask$1;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->a:Ljava/io/RandomAccessFile;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v1, p0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->a:Ljava/io/RandomAccessFile;

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    iput-object v1, p0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->a:Ljava/io/RandomAccessFile;

    throw v0

    :cond_0
    return-void
.end method

.method public b()V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->c:I

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->d:J

    iput v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->e:I

    iput v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->f:I

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->h:Z

    iput-wide v1, p0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->i:J

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->j:J

    const-wide/16 v0, 0x32

    iput-wide v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->k:J

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->g:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->clear()V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TransferTask$CacheVar;->a()V

    return-void
.end method
