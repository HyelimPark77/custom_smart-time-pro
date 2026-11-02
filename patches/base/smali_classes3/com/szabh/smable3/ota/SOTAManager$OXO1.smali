.class public final Lcom/szabh/smable3/ota/SOTAManager$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/szabh/smable3/ota/SOTAManager;-><init>(Landroid/content/Context;Lcom/android/mltcode/paycertificationapi/zc1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/szabh/smable3/ota/SOTAManager;


# direct methods
.method public constructor <init>(Lcom/szabh/smable3/ota/SOTAManager;)V
    .locals 0

    iput-object p1, p0, Lcom/szabh/smable3/ota/SOTAManager$OXO1;->IO:Lcom/szabh/smable3/ota/SOTAManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "service"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/szabh/smable3/ota/SOTAManager$OXO1;->IO:Lcom/szabh/smable3/ota/SOTAManager;

    check-cast p2, Lcom/sifli/siflidfu/SifliDFUService$SifliDFUBinder;

    invoke-static {p1, p2}, Lcom/szabh/smable3/ota/SOTAManager;->I1XOi1(Lcom/szabh/smable3/ota/SOTAManager;Lcom/sifli/siflidfu/SifliDFUService$SifliDFUBinder;)V

    iget-object p1, p0, Lcom/szabh/smable3/ota/SOTAManager$OXO1;->IO:Lcom/szabh/smable3/ota/SOTAManager;

    invoke-static {p1}, Lcom/szabh/smable3/ota/SOTAManager;->X1ii(Lcom/szabh/smable3/ota/SOTAManager;)Lcom/sifli/siflidfu/SifliDFUService$SifliDFUBinder;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/sifli/siflidfu/SifliDFUService$SifliDFUBinder;->getDfuService()Lcom/sifli/siflidfu/ISifliDFUService;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-static {p1, p2}, Lcom/szabh/smable3/ota/SOTAManager;->IIX1OXO(Lcom/szabh/smable3/ota/SOTAManager;Lcom/sifli/siflidfu/ISifliDFUService;)V

    iget-object p1, p0, Lcom/szabh/smable3/ota/SOTAManager$OXO1;->IO:Lcom/szabh/smable3/ota/SOTAManager;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/szabh/smable3/ota/SOTAManager;->X0O(Lcom/szabh/smable3/ota/SOTAManager;Z)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/szabh/smable3/ota/SOTAManager$OXO1;->IO:Lcom/szabh/smable3/ota/SOTAManager;

    invoke-static {v0}, Lcom/szabh/smable3/ota/SOTAManager;->O10IXXX0X(Lcom/szabh/smable3/ota/SOTAManager;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " onServiceConnected"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/szabh/smable3/ota/SOTAManager$OXO1;->IO:Lcom/szabh/smable3/ota/SOTAManager;

    invoke-static {p1}, Lcom/szabh/smable3/ota/SOTAManager;->XiOIO(Lcom/szabh/smable3/ota/SOTAManager;)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/szabh/smable3/ota/SOTAManager$OXO1;->IO:Lcom/szabh/smable3/ota/SOTAManager;

    invoke-static {v1}, Lcom/szabh/smable3/ota/SOTAManager;->O10IXXX0X(Lcom/szabh/smable3/ota/SOTAManager;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onServiceDisconnected"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/szabh/smable3/ota/SOTAManager$OXO1;->IO:Lcom/szabh/smable3/ota/SOTAManager;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/szabh/smable3/ota/SOTAManager;->X0O(Lcom/szabh/smable3/ota/SOTAManager;Z)V

    return-void
.end method
