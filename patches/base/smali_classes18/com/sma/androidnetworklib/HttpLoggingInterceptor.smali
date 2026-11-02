.class public Lcom/sma/androidnetworklib/HttpLoggingInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;,
        Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;
    }
.end annotation


# static fields
.field public static final iO:Ljava/nio/charset/Charset;


# instance fields
.field public final OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

.field public volatile XIi00iiXO:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->iO:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    invoke-direct {p0, v0}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;-><init>(Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;)V

    return-void
.end method

.method public constructor <init>(Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;->NONE:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    iput-object v0, p0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->XIi00iiXO:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    .line 4
    iput-object p1, p0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    return-void
.end method

.method public static XO0O10(Lokio/Buffer;)Z
    .locals 7

    const/4 v0, 0x0

    :try_start_0
    new-instance v2, Lokio/Buffer;

    invoke-direct {v2}, Lokio/Buffer;-><init>()V

    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide v3

    const-wide/16 v5, 0x40

    cmp-long v1, v3, v5

    if-gez v1, :cond_0

    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide v5

    :cond_0
    const-wide/16 v3, 0x0

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lokio/Buffer;->copyTo(Lokio/Buffer;JJ)Lokio/Buffer;

    move p0, v0

    :goto_0
    const/16 v1, 0x10

    if-ge p0, v1, :cond_3

    invoke-virtual {v2}, Lokio/Buffer;->exhausted()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lokio/Buffer;->readUtf8CodePoint()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isISOControl(I)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v1, :cond_2

    return v0

    :cond_2
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    const/4 p0, 0x1

    return p0

    :catch_0
    return v0
.end method


# virtual methods
.method public O00(Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;)Lcom/sma/androidnetworklib/HttpLoggingInterceptor;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->XIi00iiXO:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "level == null. Use Level.NONE instead."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final OXO1(Lokhttp3/Headers;)Z
    .locals 1

    const-string v0, "Content-Encoding"

    invoke-virtual {p1, v0}, Lokhttp3/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, "identity"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final XIi00iiXO(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->XIi00iiXO:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    move-result-object v1

    sget-object v2, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;->NONE:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    if-ne v0, v2, :cond_0

    invoke-interface {p1, v1}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v2, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;->BODY:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    sget-object v2, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;->HEADERS:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    if-ne v0, v2, :cond_2

    :goto_0
    move v0, v3

    goto :goto_1

    :cond_2
    move v0, v4

    :goto_1
    invoke-virtual {v1}, Lokhttp3/Request;->body()Lokhttp3/RequestBody;

    move-result-object v2

    if-eqz v2, :cond_3

    move v5, v3

    goto :goto_2

    :cond_3
    move v5, v4

    :goto_2
    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->connection()Lokhttp3/Connection;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-interface {v6}, Lokhttp3/Connection;->protocol()Lokhttp3/Protocol;

    move-result-object v6

    goto :goto_3

    :cond_4
    sget-object v6, Lokhttp3/Protocol;->HTTP_1_1:Lokhttp3/Protocol;

    :goto_3
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "--> "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v8, 0x20

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v9

    invoke-virtual {v9}, Lokhttp3/HttpUrl;->uri()Ljava/net/URI;

    move-result-object v9

    invoke-virtual {v9}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, " ("

    if-nez v0, :cond_5

    if-eqz v5, :cond_5

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lokhttp3/RequestBody;->contentLength()J

    move-result-wide v9

    invoke-virtual {v5, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "-byte body)"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    :cond_5
    iget-object v2, p0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    invoke-interface {v2, v6}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    :try_start_0
    invoke-interface {p1, v1}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v9

    sub-long/2addr v9, v5

    invoke-virtual {v1, v9, v10}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    invoke-virtual {p1}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v5

    invoke-virtual {v5}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v9

    const-wide/16 v11, -0x1

    cmp-long v6, v9, v11

    if-eqz v6, :cond_6

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v11, "-byte"

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    :cond_6
    const-string v6, "unknown-length"

    :goto_4
    iget-object v11, p0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "<-- "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lokhttp3/Response;->code()I

    move-result v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lokhttp3/Response;->message()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lokhttp3/Response;->request()Lokhttp3/Request;

    move-result-object v8

    invoke-virtual {v8}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v8

    invoke-virtual {v8}, Lokhttp3/HttpUrl;->uri()Ljava/net/URI;

    move-result-object v8

    invoke-virtual {v8}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "ms"

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v0, :cond_7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " body"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_7
    const-string v0, ""

    :goto_5
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v11, v0}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    const-string v0, "Content-Disposition"

    invoke-virtual {p1, v0}, Lokhttp3/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    const-string v1, "attachment"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    move v0, v3

    goto :goto_6

    :cond_8
    move v0, v4

    :goto_6
    invoke-virtual {v5}, Lokhttp3/ResponseBody;->contentType()Lokhttp3/MediaType;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Lokhttp3/MediaType;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    const-string v6, "octet-stream"

    invoke-virtual {v2, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_a

    const-string v6, "zip"

    invoke-virtual {v2, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_a

    const-string v6, "pdf"

    invoke-virtual {v2, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_a

    const-string v6, "image/"

    invoke-virtual {v2, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_a

    const-string v6, "video/"

    invoke-virtual {v2, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_a

    const-string v6, "audio/"

    invoke-virtual {v2, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_7

    :cond_9
    move v3, v4

    :cond_a
    :goto_7
    move v4, v3

    :cond_b
    if-nez v0, :cond_12

    if-nez v4, :cond_12

    const-wide/32 v2, 0xc800

    cmp-long v0, v9, v2

    if-lez v0, :cond_c

    goto :goto_8

    :cond_c
    invoke-static {p1}, Lokhttp3/internal/http/HttpHeaders;->hasBody(Lokhttp3/Response;)Z

    move-result v0

    if-nez v0, :cond_d

    iget-object v0, p0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    const-string v1, "<-- END HTTP"

    invoke-interface {v0, v1}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    return-object p1

    :cond_d
    invoke-virtual {p1}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1(Lokhttp3/Headers;)Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, p0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    const-string v1, "<-- END HTTP (encoded body omitted)"

    invoke-interface {v0, v1}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    return-object p1

    :cond_e
    invoke-virtual {v5}, Lokhttp3/ResponseBody;->source()Lokio/BufferedSource;

    move-result-object v0

    const-wide v2, 0x7fffffffffffffffL

    invoke-interface {v0, v2, v3}, Lokio/BufferedSource;->request(J)Z

    invoke-interface {v0}, Lokio/BufferedSource;->buffer()Lokio/Buffer;

    move-result-object v0

    sget-object v2, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->iO:Ljava/nio/charset/Charset;

    if-eqz v1, :cond_f

    invoke-virtual {v1, v2}, Lokhttp3/MediaType;->charset(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v2

    :cond_f
    invoke-static {v0}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->XO0O10(Lokio/Buffer;)Z

    move-result v1

    if-nez v1, :cond_10

    iget-object v1, p0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "<-- END HTTP (binary "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lokio/Buffer;->size()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "-byte body omitted)"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    return-object p1

    :cond_10
    const-wide/16 v3, 0x0

    cmp-long v1, v9, v3

    if-eqz v1, :cond_11

    iget-object v1, p0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    invoke-virtual {v0}, Lokio/Buffer;->clone()Lokio/Buffer;

    move-result-object v0

    invoke-virtual {v0, v2}, Lokio/Buffer;->readString(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    :cond_11
    return-object p1

    :cond_12
    :goto_8
    iget-object v0, p0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    const-string v1, "<-- END HTTP (large file download, body logging skipped)"

    invoke-interface {v0, v1}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "<-- HTTP FAILED "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/HttpUrl;->uri()Ljava/net/URI;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  : "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    throw p1
.end method

.method public iO()Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;
    .locals 1

    iget-object v0, p0, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->XIi00iiXO:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    return-object v0
.end method

.method public intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v2, v1, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->XIi00iiXO:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    invoke-interface {v0}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    move-result-object v3

    sget-object v4, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;->NONE:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    if-ne v2, v4, :cond_0

    invoke-interface {v0, v3}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v4, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;->CUSTOM:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    if-ne v2, v4, :cond_1

    invoke-virtual/range {p0 .. p1}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->XIi00iiXO(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;

    move-result-object v0

    return-object v0

    :cond_1
    sget-object v4, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;->BODY:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    const/4 v6, 0x1

    if-ne v2, v4, :cond_2

    move v4, v6

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_0
    if-nez v4, :cond_4

    sget-object v7, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;->HEADERS:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    if-ne v2, v7, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    move v2, v6

    :goto_2
    invoke-virtual {v3}, Lokhttp3/Request;->body()Lokhttp3/RequestBody;

    move-result-object v7

    if-eqz v7, :cond_5

    goto :goto_3

    :cond_5
    const/4 v6, 0x0

    :goto_3
    invoke-interface {v0}, Lokhttp3/Interceptor$Chain;->connection()Lokhttp3/Connection;

    move-result-object v8

    if-eqz v8, :cond_6

    invoke-interface {v8}, Lokhttp3/Connection;->protocol()Lokhttp3/Protocol;

    move-result-object v8

    goto :goto_4

    :cond_6
    sget-object v8, Lokhttp3/Protocol;->HTTP_1_1:Lokhttp3/Protocol;

    :goto_4
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "--> "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v10, 0x20

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const-string v9, "-byte body)"

    const-string v11, " ("

    if-nez v2, :cond_7

    if-eqz v6, :cond_7

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Lokhttp3/RequestBody;->contentLength()J

    move-result-wide v13

    invoke-virtual {v12, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    :cond_7
    iget-object v12, v1, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    invoke-interface {v12, v8}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    const-string v8, "-byte body omitted)"

    const-string v12, ": "

    const-string v15, ""

    if-eqz v2, :cond_12

    if-eqz v6, :cond_a

    invoke-virtual {v7}, Lokhttp3/RequestBody;->contentType()Lokhttp3/MediaType;

    move-result-object v16

    if-eqz v16, :cond_8

    iget-object v5, v1, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    const-wide/16 v17, -0x1

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Content-Type: "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Lokhttp3/RequestBody;->contentType()Lokhttp3/MediaType;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v5, v13}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    goto :goto_5

    :cond_8
    const-wide/16 v17, -0x1

    :goto_5
    invoke-virtual {v7}, Lokhttp3/RequestBody;->contentLength()J

    move-result-wide v13

    cmp-long v5, v13, v17

    if-eqz v5, :cond_9

    iget-object v5, v1, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Content-Length: "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v19, v11

    invoke-virtual {v7}, Lokhttp3/RequestBody;->contentLength()J

    move-result-wide v10

    invoke-virtual {v13, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v5, v10}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    goto :goto_6

    :cond_9
    move-object/from16 v19, v11

    goto :goto_6

    :cond_a
    move-object/from16 v19, v11

    const-wide/16 v17, -0x1

    :goto_6
    invoke-virtual {v3}, Lokhttp3/Request;->headers()Lokhttp3/Headers;

    move-result-object v5

    invoke-virtual {v5}, Lokhttp3/Headers;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_7
    if-ge v11, v10, :cond_c

    invoke-virtual {v5, v11}, Lokhttp3/Headers;->name(I)Ljava/lang/String;

    move-result-object v13

    const-string v14, "Content-Type"

    invoke-virtual {v14, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v14

    if-nez v14, :cond_b

    const-string v14, "Content-Length"

    invoke-virtual {v14, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v14

    if-nez v14, :cond_b

    iget-object v14, v1, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    move/from16 v20, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v11}, Lokhttp3/Headers;->value(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v14, v2}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    goto :goto_8

    :cond_b
    move/from16 v20, v2

    :goto_8
    add-int/lit8 v11, v11, 0x1

    move/from16 v2, v20

    goto :goto_7

    :cond_c
    move/from16 v20, v2

    const-string v2, "--> END "

    if-eqz v4, :cond_d

    if-nez v6, :cond_e

    :cond_d
    move-object/from16 v10, v19

    goto/16 :goto_9

    :cond_e
    invoke-virtual {v3}, Lokhttp3/Request;->headers()Lokhttp3/Headers;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1(Lokhttp3/Headers;)Z

    move-result v5

    if-eqz v5, :cond_f

    iget-object v5, v1, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " (encoded body omitted)"

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v5, v2}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    move-object/from16 v10, v19

    goto/16 :goto_a

    :cond_f
    new-instance v5, Lokio/Buffer;

    invoke-direct {v5}, Lokio/Buffer;-><init>()V

    invoke-virtual {v7, v5}, Lokhttp3/RequestBody;->writeTo(Lokio/BufferedSink;)V

    sget-object v6, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->iO:Ljava/nio/charset/Charset;

    invoke-virtual {v7}, Lokhttp3/RequestBody;->contentType()Lokhttp3/MediaType;

    move-result-object v10

    if-eqz v10, :cond_10

    invoke-virtual {v10, v6}, Lokhttp3/MediaType;->charset(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v6

    :cond_10
    iget-object v10, v1, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    invoke-interface {v10, v15}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    invoke-static {v5}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->XO0O10(Lokio/Buffer;)Z

    move-result v10

    if-eqz v10, :cond_11

    iget-object v10, v1, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    invoke-virtual {v5, v6}, Lokio/Buffer;->readString(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v10, v5}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    iget-object v5, v1, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v10, v19

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Lokhttp3/RequestBody;->contentLength()J

    move-result-wide v13

    invoke-virtual {v6, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v5, v2}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    goto :goto_a

    :cond_11
    move-object/from16 v10, v19

    iget-object v5, v1, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " (binary "

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Lokhttp3/RequestBody;->contentLength()J

    move-result-wide v13

    invoke-virtual {v6, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v5, v2}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    goto :goto_a

    :goto_9
    iget-object v5, v1, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v5, v2}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    goto :goto_a

    :cond_12
    move/from16 v20, v2

    move-object v10, v11

    const-wide/16 v17, -0x1

    :goto_a
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    :try_start_0
    invoke-interface {v0, v3}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v13

    sub-long/2addr v13, v5

    invoke-virtual {v2, v13, v14}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    invoke-virtual {v0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v5

    invoke-virtual {v5}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v6

    cmp-long v11, v6, v17

    if-eqz v11, :cond_13

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v13, "-byte"

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    goto :goto_b

    :cond_13
    const-string v11, "unknown-length"

    :goto_b
    iget-object v13, v1, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 p1, v0

    const-string v0, "<-- "

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, Lokhttp3/Response;->code()I

    move-result v0

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x20

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move/from16 v17, v4

    invoke-virtual/range {p1 .. p1}, Lokhttp3/Response;->message()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, Lokhttp3/Response;->request()Lokhttp3/Request;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "ms"

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v20, :cond_14

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " body"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_c

    :cond_14
    move-object v0, v15

    :goto_c
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v13, v0}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    if-eqz v20, :cond_1c

    invoke-virtual/range {p1 .. p1}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Headers;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_d
    if-ge v3, v2, :cond_15

    iget-object v4, v1, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Lokhttp3/Headers;->name(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Lokhttp3/Headers;->value(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v4, v10}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_d

    :cond_15
    if-eqz v17, :cond_1b

    invoke-static/range {p1 .. p1}, Lokhttp3/internal/http/HttpHeaders;->hasBody(Lokhttp3/Response;)Z

    move-result v0

    if-nez v0, :cond_16

    goto/16 :goto_e

    :cond_16
    invoke-virtual/range {p1 .. p1}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1(Lokhttp3/Headers;)Z

    move-result v0

    if-eqz v0, :cond_17

    iget-object v0, v1, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    const-string v2, "<-- END HTTP (encoded body omitted)"

    invoke-interface {v0, v2}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    return-object p1

    :cond_17
    invoke-virtual {v5}, Lokhttp3/ResponseBody;->source()Lokio/BufferedSource;

    move-result-object v0

    const-wide v2, 0x7fffffffffffffffL

    invoke-interface {v0, v2, v3}, Lokio/BufferedSource;->request(J)Z

    invoke-interface {v0}, Lokio/BufferedSource;->buffer()Lokio/Buffer;

    move-result-object v0

    sget-object v2, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->iO:Ljava/nio/charset/Charset;

    invoke-virtual {v5}, Lokhttp3/ResponseBody;->contentType()Lokhttp3/MediaType;

    move-result-object v3

    if-eqz v3, :cond_18

    invoke-virtual {v3, v2}, Lokhttp3/MediaType;->charset(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v2

    :cond_18
    invoke-static {v0}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->XO0O10(Lokio/Buffer;)Z

    move-result v3

    if-nez v3, :cond_19

    iget-object v2, v1, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    invoke-interface {v2, v15}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    iget-object v2, v1, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "<-- END HTTP (binary "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lokio/Buffer;->size()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    return-object p1

    :cond_19
    const-wide/16 v3, 0x0

    cmp-long v3, v6, v3

    if-eqz v3, :cond_1a

    iget-object v3, v1, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    invoke-interface {v3, v15}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    iget-object v3, v1, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    invoke-virtual {v0}, Lokio/Buffer;->clone()Lokio/Buffer;

    move-result-object v4

    invoke-virtual {v4, v2}, Lokio/Buffer;->readString(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    :cond_1a
    iget-object v2, v1, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "<-- END HTTP ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lokio/Buffer;->size()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    return-object p1

    :cond_1b
    :goto_e
    iget-object v0, v1, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    const-string v2, "<-- END HTTP"

    invoke-interface {v0, v2}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    :cond_1c
    return-object p1

    :catch_0
    move-exception v0

    iget-object v2, v1, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "<-- HTTP FAILED "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v3

    invoke-virtual {v3}, Lokhttp3/HttpUrl;->uri()Ljava/net/URI;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "  : "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->log(Ljava/lang/String;)V

    throw v0
.end method
