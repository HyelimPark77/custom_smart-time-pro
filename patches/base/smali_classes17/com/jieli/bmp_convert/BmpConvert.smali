.class public Lcom/jieli/bmp_convert/BmpConvert;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ERR_FILE_TYPE:I = -0xe04

.field public static final ERR_INVALID_PARAM:I = -0xe00

.field public static final ERR_IN_PROGRESS:I = -0xe03

.field public static final ERR_IO_EXCEPTION:I = -0xe02

.field public static final ERR_NOT_FOUND_FILE:I = -0xe01

.field public static final TYPE_695N_RBG:I = 0x0

.field public static final TYPE_701N_ARGB:I = 0x2

.field public static final TYPE_701N_ARGB_NO_PACK:I = 0x4

.field public static final TYPE_701N_JPEG:I = 0x9

.field public static final TYPE_701N_RGB:I = 0x1

.field public static final TYPE_701N_RGB_NO_PACK:I = 0x3

.field public static final TYPE_707N_ARGB:I = 0x6

.field public static final TYPE_707N_ARGB_NO_PACK:I = 0x8

.field public static final TYPE_707N_RGB:I = 0x5

.field public static final TYPE_707N_RGB_NO_PACK:I = 0x7

.field public static final TYPE_BR_23:I = 0x0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final TYPE_BR_28:I = 0x1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final TYPE_BR_28_ALPHA:I = 0x2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final TYPE_BR_28_ALPHA_RAW:I = 0x4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final TYPE_BR_28_RAW:I = 0x3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final d:Ljava/lang/String; = "BmpConvert"

.field public static final e:[I

.field public static isLog:Z = false


# instance fields
.field public volatile a:Z

.field public b:Ljava/util/concurrent/ExecutorService;

.field public final c:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/jieli/bmp_convert/BmpConvert;->e:[I

    :try_start_0
    const-string v0, "jl_bmp_convert"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void

    :array_0
    .array-data 4
        0x0
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x7
        0x8
        0x9
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/jieli/bmp_convert/BmpConvert;->c:Landroid/os/Handler;

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {}, Lcom/jieli/bmp_convert/BmpConvert;->getLibVersionName()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/jieli/bmp_convert/BmpConvert;->getLibVersionCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v1, v2, p0}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Library name = %s(%d), clazz : %s"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "init"

    invoke-virtual {p0, v1, v0}, Lcom/jieli/bmp_convert/BmpConvert;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static getLibVersionCode()I
    .locals 1

    const/16 v0, 0x296c

    return v0
.end method

.method public static getLibVersionName()Ljava/lang/String;
    .locals 1

    :try_start_0
    const-string v0, "1.6.0"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const-string v0, "0.0.0"

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 15
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "[%s]\t%s"

    invoke-static {v0, p2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic a(Lcom/jieli/bmp_convert/ConvertResult;Lcom/jieli/bmp_convert/OnConvertListener;Ljava/lang/String;)V
    .locals 2

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "end ... "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "bitmapConvert"

    invoke-virtual {p0, v1, v0}, Lcom/jieli/bmp_convert/BmpConvert;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    invoke-virtual {p1}, Lcom/jieli/bmp_convert/ConvertResult;->isConvertSuccess()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 9
    invoke-interface {p2, v0, p3}, Lcom/jieli/bmp_convert/OnConvertListener;->onStop(ZLjava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 10
    invoke-interface {p2, v0, v1}, Lcom/jieli/bmp_convert/OnConvertListener;->onStop(ZLjava/lang/String;)V

    .line 11
    :goto_0
    invoke-interface {p2, p1, p3}, Lcom/jieli/bmp_convert/OnConvertListener;->onStop(Lcom/jieli/bmp_convert/ConvertResult;Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic a(Lcom/jieli/bmp_convert/OnConvertListener;Ljava/lang/String;)V
    .locals 2

    .line 5
    const-string v0, "bitmapConvert"

    const-string v1, "start"

    invoke-virtual {p0, v0, v1}, Lcom/jieli/bmp_convert/BmpConvert;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-interface {p1, p2}, Lcom/jieli/bmp_convert/OnConvertListener;->onStart(Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic a(Lcom/jieli/bmp_convert/OnConvertListener;Ljava/lang/String;Lcom/jieli/bmp_convert/ConvertParam;ILjava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/jieli/bmp_convert/BmpConvert;->c:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I011XI;

    invoke-direct {v1, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/I011XI;-><init>(Lcom/jieli/bmp_convert/BmpConvert;Lcom/jieli/bmp_convert/OnConvertListener;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    if-nez p3, :cond_1

    .line 2
    new-instance p3, Lcom/jieli/bmp_convert/ConvertParam;

    invoke-direct {p3}, Lcom/jieli/bmp_convert/ConvertParam;-><init>()V

    .line 3
    :cond_1
    invoke-virtual {p0, p4, p2, p5, p3}, Lcom/jieli/bmp_convert/BmpConvert;->bitmapConvertAndCompressBlock(ILjava/lang/String;Ljava/lang/String;Lcom/jieli/bmp_convert/ConvertParam;)Lcom/jieli/bmp_convert/ConvertResult;

    move-result-object p2

    if-eqz p1, :cond_2

    .line 4
    iget-object p3, p0, Lcom/jieli/bmp_convert/BmpConvert;->c:Landroid/os/Handler;

    new-instance p4, Lcom/android/mltcode/paycertificationapi/OXOIIOi1;

    invoke-direct {p4, p0, p2, p1, p5}, Lcom/android/mltcode/paycertificationapi/OXOIIOi1;-><init>(Lcom/jieli/bmp_convert/BmpConvert;Lcom/jieli/bmp_convert/ConvertResult;Lcom/jieli/bmp_convert/OnConvertListener;Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    return-void
.end method

.method public final a(I)Z
    .locals 5

    .line 12
    sget-object v0, Lcom/jieli/bmp_convert/BmpConvert;->e:[I

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget v4, v0, v3

    if-ne v4, p1, :cond_0

    return v2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 13
    :cond_0
    const-string v1, ".jpg"

    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, ".JPG"

    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 14
    const-string v1, ".jpeg"

    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, ".JPEG"

    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    return v0

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/jieli/bmp_convert/BmpConvert;->isLog:Z

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    sget-object v0, Lcom/jieli/bmp_convert/BmpConvert;->d:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/jieli/bmp_convert/BmpConvert;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/bmp_convert/BmpConvert;->b(Ljava/lang/String;)V

    return-void
.end method

.method public bitmapConvert(ILjava/lang/String;Ljava/lang/String;Lcom/jieli/bmp_convert/ConvertParam;Lcom/jieli/bmp_convert/OnConvertListener;)V
    .locals 8

    .line 3
    iget-object v0, p0, Lcom/jieli/bmp_convert/BmpConvert;->b:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    :cond_0
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/bmp_convert/BmpConvert;->b:Ljava/util/concurrent/ExecutorService;

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/jieli/bmp_convert/BmpConvert;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OI0X1XI1;

    move-object v2, p0

    move v6, p1

    move-object v4, p2

    move-object v7, p3

    move-object v5, p4

    move-object v3, p5

    invoke-direct/range {v1 .. v7}, Lcom/android/mltcode/paycertificationapi/OI0X1XI1;-><init>(Lcom/jieli/bmp_convert/BmpConvert;Lcom/jieli/bmp_convert/OnConvertListener;Ljava/lang/String;Lcom/jieli/bmp_convert/ConvertParam;ILjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public bitmapConvert(ILjava/lang/String;Ljava/lang/String;Lcom/jieli/bmp_convert/OnConvertListener;)V
    .locals 6

    .line 2
    new-instance v4, Lcom/jieli/bmp_convert/ConvertParam;

    invoke-direct {v4}, Lcom/jieli/bmp_convert/ConvertParam;-><init>()V

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/jieli/bmp_convert/BmpConvert;->bitmapConvert(ILjava/lang/String;Ljava/lang/String;Lcom/jieli/bmp_convert/ConvertParam;Lcom/jieli/bmp_convert/OnConvertListener;)V

    return-void
.end method

.method public bitmapConvert(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/bmp_convert/OnConvertListener;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1, p2, p3}, Lcom/jieli/bmp_convert/BmpConvert;->bitmapConvert(ILjava/lang/String;Ljava/lang/String;Lcom/jieli/bmp_convert/OnConvertListener;)V

    return-void
.end method

.method public bitmapConvertAndCompressBlock(ILjava/lang/String;Ljava/lang/String;)Lcom/jieli/bmp_convert/ConvertResult;
    .locals 1

    .line 1
    new-instance v0, Lcom/jieli/bmp_convert/ConvertParam;

    invoke-direct {v0}, Lcom/jieli/bmp_convert/ConvertParam;-><init>()V

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/jieli/bmp_convert/BmpConvert;->bitmapConvertAndCompressBlock(ILjava/lang/String;Ljava/lang/String;Lcom/jieli/bmp_convert/ConvertParam;)Lcom/jieli/bmp_convert/ConvertResult;

    move-result-object p1

    return-object p1
.end method

.method public bitmapConvertAndCompressBlock(ILjava/lang/String;Ljava/lang/String;Lcom/jieli/bmp_convert/ConvertParam;)Lcom/jieli/bmp_convert/ConvertResult;
    .locals 17

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v0, p2

    .line 2
    invoke-virtual/range {p0 .. p1}, Lcom/jieli/bmp_convert/BmpConvert;->a(I)Z

    move-result v3

    const-string v8, "bitmapConvertAndCompressBlock"

    if-eqz v3, :cond_0

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown Type : "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v8, v0}, Lcom/jieli/bmp_convert/BmpConvert;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    new-instance v0, Lcom/jieli/bmp_convert/ConvertResult;

    invoke-direct {v0}, Lcom/jieli/bmp_convert/ConvertResult;-><init>()V

    .line 5
    invoke-virtual {v0, v2}, Lcom/jieli/bmp_convert/ConvertResult;->setAlgorithm(I)Lcom/jieli/bmp_convert/ConvertResult;

    move-result-object v0

    const/16 v2, -0xe00

    .line 6
    invoke-virtual {v0, v2}, Lcom/jieli/bmp_convert/ConvertResult;->setResult(I)Lcom/jieli/bmp_convert/ConvertResult;

    move-result-object v0

    return-object v0

    .line 7
    :cond_0
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    move-result v4

    if-nez v4, :cond_1

    goto/16 :goto_5

    .line 9
    :cond_1
    invoke-virtual {v1}, Lcom/jieli/bmp_convert/BmpConvert;->isWorking()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 10
    const-string v0, "Conversion in progress."

    invoke-virtual {v1, v8, v0}, Lcom/jieli/bmp_convert/BmpConvert;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    new-instance v0, Lcom/jieli/bmp_convert/ConvertResult;

    invoke-direct {v0}, Lcom/jieli/bmp_convert/ConvertResult;-><init>()V

    .line 12
    invoke-virtual {v0, v2}, Lcom/jieli/bmp_convert/ConvertResult;->setAlgorithm(I)Lcom/jieli/bmp_convert/ConvertResult;

    move-result-object v0

    const/16 v2, -0xe03

    .line 13
    invoke-virtual {v0, v2}, Lcom/jieli/bmp_convert/ConvertResult;->setResult(I)Lcom/jieli/bmp_convert/ConvertResult;

    move-result-object v0

    return-object v0

    :cond_2
    const/4 v4, 0x1

    .line 14
    iput-boolean v4, v1, Lcom/jieli/bmp_convert/BmpConvert;->a:Z

    .line 15
    new-instance v4, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 16
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v5, v4, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 17
    invoke-static {v0, v4}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v9

    .line 18
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v12

    .line 19
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v16

    const/16 v4, 0x9

    const/4 v5, 0x0

    if-ne v2, v4, :cond_4

    .line 20
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/jieli/bmp_convert/BmpConvert;->a(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 21
    const-string v0, "It\'s not a JPG image."

    invoke-virtual {v1, v8, v0}, Lcom/jieli/bmp_convert/BmpConvert;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    new-instance v0, Lcom/jieli/bmp_convert/ConvertResult;

    invoke-direct {v0}, Lcom/jieli/bmp_convert/ConvertResult;-><init>()V

    .line 23
    invoke-virtual {v0, v2}, Lcom/jieli/bmp_convert/ConvertResult;->setAlgorithm(I)Lcom/jieli/bmp_convert/ConvertResult;

    move-result-object v0

    const/16 v2, -0xe04

    .line 24
    invoke-virtual {v0, v2}, Lcom/jieli/bmp_convert/ConvertResult;->setResult(I)Lcom/jieli/bmp_convert/ConvertResult;

    move-result-object v0

    return-object v0

    :cond_3
    const/4 v3, 0x0

    :goto_0
    move-object v4, v3

    move-object v3, v0

    move-object v0, v4

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move v9, v5

    move v4, v12

    move/from16 v5, v16

    goto/16 :goto_3

    :cond_4
    mul-int v3, v12, v16

    .line 25
    new-array v10, v3, [I

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v11, 0x0

    move v15, v12

    .line 26
    invoke-virtual/range {v9 .. v16}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    mul-int/lit8 v4, v3, 0x4

    .line 27
    new-array v4, v4, [B

    move v6, v5

    :goto_1
    if-ge v6, v3, :cond_5

    shl-int/lit8 v7, v6, 0x2

    .line 28
    aget v9, v10, v6

    and-int/lit16 v11, v9, 0xff

    int-to-byte v11, v11

    aput-byte v11, v4, v7

    add-int/lit8 v11, v7, 0x1

    shr-int/lit8 v13, v9, 0x8

    and-int/lit16 v13, v13, 0xff

    int-to-byte v13, v13

    .line 29
    aput-byte v13, v4, v11

    add-int/lit8 v11, v7, 0x2

    shr-int/lit8 v13, v9, 0x10

    and-int/lit16 v13, v13, 0xff

    int-to-byte v13, v13

    .line 30
    aput-byte v13, v4, v11

    add-int/lit8 v7, v7, 0x3

    shr-int/lit8 v9, v9, 0x18

    and-int/lit16 v9, v9, 0xff

    int-to-byte v9, v9

    .line 31
    aput-byte v9, v4, v7

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 32
    :cond_5
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "."

    invoke-virtual {v0, v6}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v0, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".bin"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 33
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/16 v6, -0xe02

    .line 34
    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_6

    .line 35
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    move-result v7

    if-nez v7, :cond_6

    .line 36
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Failed to delete file. path : "

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v8, v7}, Lcom/jieli/bmp_convert/BmpConvert;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :catch_0
    move-exception v0

    move v9, v5

    goto/16 :goto_4

    .line 37
    :cond_6
    :goto_2
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z

    move-result v7

    if-nez v7, :cond_7

    .line 38
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to create new file. path : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v8, v0}, Lcom/jieli/bmp_convert/BmpConvert;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    iput-boolean v5, v1, Lcom/jieli/bmp_convert/BmpConvert;->a:Z

    .line 40
    new-instance v0, Lcom/jieli/bmp_convert/ConvertResult;

    invoke-direct {v0}, Lcom/jieli/bmp_convert/ConvertResult;-><init>()V

    .line 41
    invoke-virtual {v0, v2}, Lcom/jieli/bmp_convert/ConvertResult;->setAlgorithm(I)Lcom/jieli/bmp_convert/ConvertResult;

    move-result-object v0

    .line 42
    invoke-virtual {v0, v6}, Lcom/jieli/bmp_convert/ConvertResult;->setResult(I)Lcom/jieli/bmp_convert/ConvertResult;

    move-result-object v0

    return-object v0

    .line 43
    :cond_7
    new-instance v7, Ljava/io/FileOutputStream;

    invoke-direct {v7, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 44
    invoke-virtual {v7, v4}, Ljava/io/FileOutputStream;->write([B)V

    .line 45
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 46
    :goto_3
    invoke-virtual/range {v1 .. v7}, Lcom/jieli/bmp_convert/BmpConvert;->bmpConvert_native(ILjava/lang/String;IILjava/lang/String;Lcom/jieli/bmp_convert/ConvertParam;)Lcom/jieli/bmp_convert/ConvertResult;

    move-result-object v2

    .line 47
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "result : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v8, v4}, Lcom/jieli/bmp_convert/BmpConvert;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    invoke-virtual {v2}, Lcom/jieli/bmp_convert/ConvertResult;->isConvertSuccess()Z

    move-result v4

    if-eqz v4, :cond_8

    if-eqz v0, :cond_8

    .line 49
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_8

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to delete cache file. path : "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v8, v0}, Lcom/jieli/bmp_convert/BmpConvert;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    :cond_8
    iput-boolean v9, v1, Lcom/jieli/bmp_convert/BmpConvert;->a:Z

    return-object v2

    .line 52
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 53
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "IOException : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v8, v0}, Lcom/jieli/bmp_convert/BmpConvert;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    iput-boolean v9, v1, Lcom/jieli/bmp_convert/BmpConvert;->a:Z

    .line 55
    new-instance v0, Lcom/jieli/bmp_convert/ConvertResult;

    invoke-direct {v0}, Lcom/jieli/bmp_convert/ConvertResult;-><init>()V

    .line 56
    invoke-virtual {v0, v2}, Lcom/jieli/bmp_convert/ConvertResult;->setAlgorithm(I)Lcom/jieli/bmp_convert/ConvertResult;

    move-result-object v0

    .line 57
    invoke-virtual {v0, v6}, Lcom/jieli/bmp_convert/ConvertResult;->setResult(I)Lcom/jieli/bmp_convert/ConvertResult;

    move-result-object v0

    return-object v0

    .line 58
    :cond_9
    :goto_5
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "File not found. path : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v8, v0}, Lcom/jieli/bmp_convert/BmpConvert;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    new-instance v0, Lcom/jieli/bmp_convert/ConvertResult;

    invoke-direct {v0}, Lcom/jieli/bmp_convert/ConvertResult;-><init>()V

    .line 60
    invoke-virtual {v0, v2}, Lcom/jieli/bmp_convert/ConvertResult;->setAlgorithm(I)Lcom/jieli/bmp_convert/ConvertResult;

    move-result-object v0

    const/16 v2, -0xe01

    .line 61
    invoke-virtual {v0, v2}, Lcom/jieli/bmp_convert/ConvertResult;->setResult(I)Lcom/jieli/bmp_convert/ConvertResult;

    move-result-object v0

    return-object v0
.end method

.method public bitmapConvertBlock(ILjava/lang/String;Ljava/lang/String;)I
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/jieli/bmp_convert/BmpConvert;->bitmapConvertAndCompressBlock(ILjava/lang/String;Ljava/lang/String;)Lcom/jieli/bmp_convert/ConvertResult;

    move-result-object p1

    if-nez p1, :cond_0

    const/16 p1, -0xe00

    return p1

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/bmp_convert/ConvertResult;->getResult()I

    move-result p1

    return p1
.end method

.method public native bmpConvert_native(ILjava/lang/String;IILjava/lang/String;Lcom/jieli/bmp_convert/ConvertParam;)Lcom/jieli/bmp_convert/ConvertResult;
.end method

.method public isWorking()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/bmp_convert/BmpConvert;->a:Z

    return v0
.end method

.method public release()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "clazz : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "release"

    invoke-virtual {p0, v1, v0}, Lcom/jieli/bmp_convert/BmpConvert;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/bmp_convert/BmpConvert;->b:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/bmp_convert/BmpConvert;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jieli/bmp_convert/BmpConvert;->b:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/jieli/bmp_convert/BmpConvert;->a:Z

    iget-object v1, p0, Lcom/jieli/bmp_convert/BmpConvert;->c:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method
